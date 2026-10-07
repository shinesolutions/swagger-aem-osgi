const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}image.quality`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}image.supported.resolutions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'image.quality': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}image.quality`)),
            'image.supported.resolutions': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}image.supported.resolutions`)),
        }
    },
}
