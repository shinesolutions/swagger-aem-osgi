const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}attachmentTypeBlacklist`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}extension.order`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attachmentTypeBlacklist': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}attachmentTypeBlacklist`)),
            'extension.order': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}extension.order`)),
        }
    },
}
