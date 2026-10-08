const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.dam.mac.sync.client.so.timeout`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.adobe.dam.mac.sync.client.so.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.dam.mac.sync.client.so.timeout`)),
        }
    },
}
