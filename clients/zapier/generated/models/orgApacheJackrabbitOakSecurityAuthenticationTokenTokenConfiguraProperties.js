const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}tokenExpiration`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}tokenLength`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}tokenRefresh`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}tokenCleanupThreshold`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}passwordHashAlgorithm`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}passwordHashIterations`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}passwordSaltSize`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'tokenExpiration': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}tokenExpiration`)),
            'tokenLength': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}tokenLength`)),
            'tokenRefresh': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}tokenRefresh`)),
            'tokenCleanupThreshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}tokenCleanupThreshold`)),
            'passwordHashAlgorithm': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}passwordHashAlgorithm`)),
            'passwordHashIterations': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}passwordHashIterations`)),
            'passwordSaltSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}passwordSaltSize`)),
        }
    },
}
