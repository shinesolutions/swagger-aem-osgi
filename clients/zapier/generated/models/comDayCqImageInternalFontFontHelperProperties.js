const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}fontpath`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}oversamplingFactor`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'fontpath': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}fontpath`)),
            'oversamplingFactor': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}oversamplingFactor`)),
        }
    },
}
