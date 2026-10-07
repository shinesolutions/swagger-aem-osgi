const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}oauth.issuer`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.access.token.expires.in`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}osgi.http.whiteboard.servlet.pattern`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}osgi.http.whiteboard.context.select`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'oauth.issuer': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.issuer`)),
            'oauth.access.token.expires.in': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.access.token.expires.in`)),
            'osgi.http.whiteboard.servlet.pattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}osgi.http.whiteboard.servlet.pattern`)),
            'osgi.http.whiteboard.context.select': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}osgi.http.whiteboard.context.select`)),
        }
    },
}
