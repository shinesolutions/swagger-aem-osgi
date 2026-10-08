const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cug.exempted.principals`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cug.enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cug.principals.regex`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cug.principals.replacement`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cug.exempted.principals': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cug.exempted.principals`)),
            'cug.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cug.enabled`)),
            'cug.principals.regex': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cug.principals.regex`)),
            'cug.principals.replacement': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cug.principals.replacement`)),
        }
    },
}
