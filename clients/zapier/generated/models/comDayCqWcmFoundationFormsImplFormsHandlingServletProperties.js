const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name.whitelist`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}allow.expressions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name.whitelist': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name.whitelist`)),
            'allow.expressions': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}allow.expressions`)),
        }
    },
}
