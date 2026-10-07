const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}whitelist.name`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}whitelist.bundles`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'whitelist.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}whitelist.name`)),
            'whitelist.bundles': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}whitelist.bundles`)),
        }
    },
}
