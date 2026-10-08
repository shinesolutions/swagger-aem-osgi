const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}mimeTypes`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxExtract`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'mimeTypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}mimeTypes`)),
            'maxExtract': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxExtract`)),
        }
    },
}
