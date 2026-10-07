const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}ttl1`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}ttl2`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable`)),
            'ttl1': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}ttl1`)),
            'ttl2': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}ttl2`)),
        }
    },
}
