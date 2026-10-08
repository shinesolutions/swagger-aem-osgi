const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}contentReferenceConfig.resourceTypes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'contentReferenceConfig.resourceTypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}contentReferenceConfig.resourceTypes`)),
        }
    },
}
