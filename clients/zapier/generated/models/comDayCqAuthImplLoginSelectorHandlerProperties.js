const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}auth.loginselector.mappings`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}auth.loginselector.changepw.mappings`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.loginselector.defaultloginpage`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auth.loginselector.defaultchangepwpage`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}auth.loginselector.handle`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}auth.loginselector.handle.all.extensions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
            'auth.loginselector.mappings': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}auth.loginselector.mappings`)),
            'auth.loginselector.changepw.mappings': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}auth.loginselector.changepw.mappings`)),
            'auth.loginselector.defaultloginpage': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.loginselector.defaultloginpage`)),
            'auth.loginselector.defaultchangepwpage': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auth.loginselector.defaultchangepwpage`)),
            'auth.loginselector.handle': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}auth.loginselector.handle`)),
            'auth.loginselector.handle.all.extensions': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}auth.loginselector.handle.all.extensions`)),
        }
    },
}
