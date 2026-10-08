const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.id`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.granite.authorization.url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.granite.token.url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.granite.profile.url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.granite.extended.details.urls`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'oauth.provider.id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.id`)),
            'oauth.provider.granite.authorization.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.granite.authorization.url`)),
            'oauth.provider.granite.token.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.granite.token.url`)),
            'oauth.provider.granite.profile.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.granite.profile.url`)),
            'oauth.provider.granite.extended.details.urls': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.granite.extended.details.urls`)),
        }
    },
}
