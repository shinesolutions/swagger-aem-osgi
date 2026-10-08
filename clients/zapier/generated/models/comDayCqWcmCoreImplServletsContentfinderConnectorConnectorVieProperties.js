const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}item.resource.types`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'item.resource.types': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}item.resource.types`)),
        }
    },
}
