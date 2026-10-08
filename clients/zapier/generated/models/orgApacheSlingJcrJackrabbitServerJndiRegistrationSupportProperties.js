const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}java.naming.factory.initial`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}java.naming.provider.url`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'java.naming.factory.initial': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}java.naming.factory.initial`)),
            'java.naming.provider.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}java.naming.provider.url`)),
        }
    },
}
