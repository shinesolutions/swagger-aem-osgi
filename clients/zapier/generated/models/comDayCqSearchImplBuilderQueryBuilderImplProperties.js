const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}excerpt.properties`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cache.max.entries`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cache.entry.lifetime`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}xpath.union`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'excerpt.properties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}excerpt.properties`)),
            'cache.max.entries': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cache.max.entries`)),
            'cache.entry.lifetime': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cache.entry.lifetime`)),
            'xpath.union': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}xpath.union`)),
        }
    },
}
