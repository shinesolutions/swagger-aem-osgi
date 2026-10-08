const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}jaas.defaultRealmName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jaas.configProviderName`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}jaas.globalConfigPolicy`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'jaas.defaultRealmName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jaas.defaultRealmName`)),
            'jaas.configProviderName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jaas.configProviderName`)),
            'jaas.globalConfigPolicy': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}jaas.globalConfigPolicy`)),
        }
    },
}
