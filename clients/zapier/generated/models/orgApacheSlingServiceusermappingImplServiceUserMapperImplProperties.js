const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}user.mapping`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}user.default`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}user.enable.default.mapping`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}require.validation`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'user.mapping': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}user.mapping`)),
            'user.default': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}user.default`)),
            'user.enable.default.mapping': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}user.enable.default.mapping`)),
            'require.validation': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}require.validation`)),
        }
    },
}
