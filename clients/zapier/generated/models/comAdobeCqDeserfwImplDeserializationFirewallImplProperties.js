const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}firewall.deserialization.whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}firewall.deserialization.blacklist`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}firewall.deserialization.diagnostics`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'firewall.deserialization.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}firewall.deserialization.whitelist`)),
            'firewall.deserialization.blacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}firewall.deserialization.blacklist`)),
            'firewall.deserialization.diagnostics': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}firewall.deserialization.diagnostics`)),
        }
    },
}
