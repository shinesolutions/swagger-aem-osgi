const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}resourceType.filters`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}priority`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'resourceType.filters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resourceType.filters`)),
            'priority': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}priority`)),
        }
    },
}
