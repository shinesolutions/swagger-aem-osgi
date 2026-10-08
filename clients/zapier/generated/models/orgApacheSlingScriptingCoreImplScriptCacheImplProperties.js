const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}org.apache.sling.scripting.cache.size`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}org.apache.sling.scripting.cache.additional_extensions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'org.apache.sling.scripting.cache.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}org.apache.sling.scripting.cache.size`)),
            'org.apache.sling.scripting.cache.additional_extensions': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}org.apache.sling.scripting.cache.additional_extensions`)),
        }
    },
}
