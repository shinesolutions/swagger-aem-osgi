const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.id`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.ims.authorization.url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.ims.token.url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.ims.profile.url`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}oauth.provider.ims.extended.details.urls`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.ims.validate.token.url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.ims.session.property`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.ims.service.token.client.id`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.ims.service.token.client.secret`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.ims.service.token`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}ims.org.ref`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}ims.group.mapping`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.provider.ims.only.license.group`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'oauth.provider.id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.id`)),
            'oauth.provider.ims.authorization.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.ims.authorization.url`)),
            'oauth.provider.ims.token.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.ims.token.url`)),
            'oauth.provider.ims.profile.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.ims.profile.url`)),
            'oauth.provider.ims.extended.details.urls': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}oauth.provider.ims.extended.details.urls`)),
            'oauth.provider.ims.validate.token.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.ims.validate.token.url`)),
            'oauth.provider.ims.session.property': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.ims.session.property`)),
            'oauth.provider.ims.service.token.client.id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.ims.service.token.client.id`)),
            'oauth.provider.ims.service.token.client.secret': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.ims.service.token.client.secret`)),
            'oauth.provider.ims.service.token': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.ims.service.token`)),
            'ims.org.ref': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}ims.org.ref`)),
            'ims.group.mapping': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}ims.group.mapping`)),
            'oauth.provider.ims.only.license.group': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.provider.ims.only.license.group`)),
        }
    },
}
