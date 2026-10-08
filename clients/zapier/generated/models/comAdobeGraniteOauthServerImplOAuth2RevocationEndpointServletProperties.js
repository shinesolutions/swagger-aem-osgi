const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.paths`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.revocation.active`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.servlet.paths': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.paths`)),
            'oauth.revocation.active': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.revocation.active`)),
        }
    },
}
