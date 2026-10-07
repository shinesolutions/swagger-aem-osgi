const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}oauth.config.id`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.client.id`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.client.secret`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}oauth.scope`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.config.provider.id`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.create.users`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.userid.property`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}force.strict.username.matching`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.encode.userids`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.hash.userids`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.callBackUrl`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.access.token.persist`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.access.token.persist.cookie`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.csrf.state.protection`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.redirect.request.params`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.config.siblings.allow`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'oauth.config.id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.config.id`)),
            'oauth.client.id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.client.id`)),
            'oauth.client.secret': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.client.secret`)),
            'oauth.scope': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}oauth.scope`)),
            'oauth.config.provider.id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.config.provider.id`)),
            'oauth.create.users': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.create.users`)),
            'oauth.userid.property': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.userid.property`)),
            'force.strict.username.matching': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}force.strict.username.matching`)),
            'oauth.encode.userids': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.encode.userids`)),
            'oauth.hash.userids': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.hash.userids`)),
            'oauth.callBackUrl': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.callBackUrl`)),
            'oauth.access.token.persist': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.access.token.persist`)),
            'oauth.access.token.persist.cookie': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.access.token.persist.cookie`)),
            'oauth.csrf.state.protection': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.csrf.state.protection`)),
            'oauth.redirect.request.params': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.redirect.request.params`)),
            'oauth.config.siblings.allow': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.config.siblings.allow`)),
        }
    },
}
