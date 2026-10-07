const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}page.info.provider.property.regex.default`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}page.info.provider.property.name`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'page.info.provider.property.regex.default': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}page.info.provider.property.regex.default`)),
            'page.info.provider.property.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}page.info.provider.property.name`)),
        }
    },
}
