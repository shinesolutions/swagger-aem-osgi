const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}history.service.resourceTypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}history.service.pathFilter`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'history.service.resourceTypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}history.service.resourceTypes`)),
            'history.service.pathFilter': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}history.service.pathFilter`)),
        }
    },
}
