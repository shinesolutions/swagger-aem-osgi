const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.id`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.github.authorization.url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.github.token.url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.github.profile.url`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'oauth.provider.id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.id`)),
            'oauth.provider.github.authorization.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.github.authorization.url`)),
            'oauth.provider.github.token.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.github.token.url`)),
            'oauth.provider.github.profile.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.github.profile.url`)),
        }
    },
}
