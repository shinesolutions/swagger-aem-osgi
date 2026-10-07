const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}maxWidth`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxHeight`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'maxWidth': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxWidth`)),
            'maxHeight': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxHeight`)),
        }
    },
}
