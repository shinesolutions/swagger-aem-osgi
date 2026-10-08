const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}xmp.propagate`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}xmp.excludes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'xmp.propagate': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}xmp.propagate`)),
            'xmp.excludes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}xmp.excludes`)),
        }
    },
}
