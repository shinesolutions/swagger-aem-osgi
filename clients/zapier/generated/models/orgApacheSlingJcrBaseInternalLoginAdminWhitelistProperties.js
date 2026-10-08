const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}whitelist.bypass`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}whitelist.bundles.regexp`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'whitelist.bypass': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}whitelist.bypass`)),
            'whitelist.bundles.regexp': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}whitelist.bundles.regexp`)),
        }
    },
}
