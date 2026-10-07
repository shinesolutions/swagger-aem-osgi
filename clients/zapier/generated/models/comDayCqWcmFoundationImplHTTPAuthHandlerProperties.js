const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}auth.http.nologin`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.http.realm`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.default.loginpage`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}auth.cred.form`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}auth.cred.utf8`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'auth.http.nologin': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}auth.http.nologin`)),
            'auth.http.realm': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.http.realm`)),
            'auth.default.loginpage': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.default.loginpage`)),
            'auth.cred.form': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}auth.cred.form`)),
            'auth.cred.utf8': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}auth.cred.utf8`)),
        }
    },
}
