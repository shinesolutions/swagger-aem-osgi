const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}dmreplicateonmodify.enabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}dmreplicateonmodify.forcesyncdeletes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dmreplicateonmodify.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}dmreplicateonmodify.enabled`)),
            'dmreplicateonmodify.forcesyncdeletes': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}dmreplicateonmodify.forcesyncdeletes`)),
        }
    },
}
