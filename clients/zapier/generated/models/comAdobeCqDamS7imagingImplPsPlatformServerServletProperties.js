const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}cache.enable`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cache.rootPaths`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cache.maxSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cache.maxEntries`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cache.enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cache.enable`)),
            'cache.rootPaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cache.rootPaths`)),
            'cache.maxSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cache.maxSize`)),
            'cache.maxEntries': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cache.maxEntries`)),
        }
    },
}
