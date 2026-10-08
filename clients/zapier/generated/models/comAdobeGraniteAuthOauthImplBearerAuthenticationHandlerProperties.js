const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}oauth.clientIds.allowed`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}auth.bearer.sync.ims`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.tokenRequestParameter`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.bearer.configid`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}oauth.jwt.support`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'oauth.clientIds.allowed': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}oauth.clientIds.allowed`)),
            'auth.bearer.sync.ims': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}auth.bearer.sync.ims`)),
            'auth.tokenRequestParameter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.tokenRequestParameter`)),
            'oauth.bearer.configid': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.bearer.configid`)),
            'oauth.jwt.support': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}oauth.jwt.support`)),
        }
    },
}
