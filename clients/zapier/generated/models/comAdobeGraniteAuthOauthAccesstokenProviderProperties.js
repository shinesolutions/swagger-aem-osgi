const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.token.provider.title`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}auth.token.provider.default.claims`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.token.provider.endpoint`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.access.token.request`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.token.provider.keypair.alias`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}auth.token.provider.conn.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}auth.token.provider.so.timeout`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.token.provider.client.id`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.token.provider.scope`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}auth.token.provider.reuse.access.token`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}auth.token.provider.relaxed.ssl`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}token.request.customizer.type`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.token.validator.type`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'auth.token.provider.title': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.token.provider.title`)),
            'auth.token.provider.default.claims': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}auth.token.provider.default.claims`)),
            'auth.token.provider.endpoint': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.token.provider.endpoint`)),
            'auth.access.token.request': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.access.token.request`)),
            'auth.token.provider.keypair.alias': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.token.provider.keypair.alias`)),
            'auth.token.provider.conn.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}auth.token.provider.conn.timeout`)),
            'auth.token.provider.so.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}auth.token.provider.so.timeout`)),
            'auth.token.provider.client.id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.token.provider.client.id`)),
            'auth.token.provider.scope': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.token.provider.scope`)),
            'auth.token.provider.reuse.access.token': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}auth.token.provider.reuse.access.token`)),
            'auth.token.provider.relaxed.ssl': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}auth.token.provider.relaxed.ssl`)),
            'token.request.customizer.type': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}token.request.customizer.type`)),
            'auth.token.validator.type': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.token.validator.type`)),
        }
    },
}
