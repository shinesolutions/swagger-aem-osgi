const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}repcache.enable`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}repcache.ttl`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}repcache.max`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'repcache.enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}repcache.enable`)),
            'repcache.ttl': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}repcache.ttl`)),
            'repcache.max': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}repcache.max`)),
        }
    },
}
