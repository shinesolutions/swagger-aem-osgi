const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.aem.screens.impl.remote.request_timeout`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.adobe.aem.screens.impl.remote.request_timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.aem.screens.impl.remote.request_timeout`)),
        }
    },
}
