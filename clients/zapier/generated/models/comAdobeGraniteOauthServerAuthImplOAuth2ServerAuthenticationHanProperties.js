const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jaas.controlFlag`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jaas.realmName`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}jaas.ranking`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.offline.validation`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'jaas.controlFlag': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jaas.controlFlag`)),
            'jaas.realmName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jaas.realmName`)),
            'jaas.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}jaas.ranking`)),
            'oauth.offline.validation': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.offline.validation`)),
        }
    },
}
