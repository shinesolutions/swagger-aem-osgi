const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}oauth.cookie.login.timeout`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.cookie.max.age`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'oauth.cookie.login.timeout': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.cookie.login.timeout`)),
            'oauth.cookie.max.age': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.cookie.max.age`)),
        }
    },
}
