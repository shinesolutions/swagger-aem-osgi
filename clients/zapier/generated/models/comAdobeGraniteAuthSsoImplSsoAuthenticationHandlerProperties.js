const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jaas.controlFlag`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jaas.realmName`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}jaas.ranking`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}headers`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cookies`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}parameters`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}usermap`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}format`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}trustedCredentialsAttribute`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
            'jaas.controlFlag': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jaas.controlFlag`)),
            'jaas.realmName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jaas.realmName`)),
            'jaas.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}jaas.ranking`)),
            'headers': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}headers`)),
            'cookies': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cookies`)),
            'parameters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}parameters`)),
            'usermap': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}usermap`)),
            'format': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}format`)),
            'trustedCredentialsAttribute': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}trustedCredentialsAttribute`)),
        }
    },
}
