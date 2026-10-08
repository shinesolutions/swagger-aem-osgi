const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.granite.httpcache.file.documentRoot`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.granite.httpcache.file.includeHost`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.adobe.granite.httpcache.file.documentRoot': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.granite.httpcache.file.documentRoot`)),
            'com.adobe.granite.httpcache.file.includeHost': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.granite.httpcache.file.includeHost`)),
        }
    },
}
