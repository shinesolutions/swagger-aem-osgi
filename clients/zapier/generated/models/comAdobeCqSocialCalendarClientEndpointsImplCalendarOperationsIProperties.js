const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}MaxRetry`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}fieldWhitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}attachmentTypeBlacklist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'MaxRetry': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}MaxRetry`)),
            'fieldWhitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}fieldWhitelist`)),
            'attachmentTypeBlacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}attachmentTypeBlacklist`)),
        }
    },
}
