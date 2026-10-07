const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}queryLimitInMemory`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queryLimitReads`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}queryFailTraversal`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}fastQuerySize`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'queryLimitInMemory': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queryLimitInMemory`)),
            'queryLimitReads': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queryLimitReads`)),
            'queryFailTraversal': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}queryFailTraversal`)),
            'fastQuerySize': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}fastQuerySize`)),
        }
    },
}
