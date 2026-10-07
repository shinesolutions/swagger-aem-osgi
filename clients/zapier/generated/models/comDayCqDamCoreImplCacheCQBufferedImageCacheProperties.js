const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.image.cache.max.memory`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.image.cache.max.age`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.dam.image.cache.max.dimension`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.image.cache.max.memory': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.image.cache.max.memory`)),
            'cq.dam.image.cache.max.age': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.image.cache.max.age`)),
            'cq.dam.image.cache.max.dimension': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.dam.image.cache.max.dimension`)),
        }
    },
}
