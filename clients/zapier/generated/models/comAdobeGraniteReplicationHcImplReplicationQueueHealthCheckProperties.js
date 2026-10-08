const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}number.of.retries.allowed`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}hc.tags`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'number.of.retries.allowed': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}number.of.retries.allowed`)),
            'hc.tags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}hc.tags`)),
        }
    },
}
