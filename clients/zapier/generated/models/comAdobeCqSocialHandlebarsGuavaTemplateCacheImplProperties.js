const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}parameter.guava.cache.enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}parameter.guava.cache.params`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}parameter.guava.cache.reload`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'parameter.guava.cache.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}parameter.guava.cache.enabled`)),
            'parameter.guava.cache.params': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}parameter.guava.cache.params`)),
            'parameter.guava.cache.reload': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}parameter.guava.cache.reload`)),
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
        }
    },
}
