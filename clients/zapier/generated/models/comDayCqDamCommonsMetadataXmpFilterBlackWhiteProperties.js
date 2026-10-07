const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}xmp.filter.apply_whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}xmp.filter.whitelist`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}xmp.filter.apply_blacklist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}xmp.filter.blacklist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'xmp.filter.apply_whitelist': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}xmp.filter.apply_whitelist`)),
            'xmp.filter.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}xmp.filter.whitelist`)),
            'xmp.filter.apply_blacklist': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}xmp.filter.apply_blacklist`)),
            'xmp.filter.blacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}xmp.filter.blacklist`)),
        }
    },
}
