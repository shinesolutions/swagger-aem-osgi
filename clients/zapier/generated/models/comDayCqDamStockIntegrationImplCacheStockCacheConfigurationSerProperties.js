const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}getCacheExpirationUnit`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}getCacheExpirationValue`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'getCacheExpirationUnit': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}getCacheExpirationUnit`)),
            'getCacheExpirationValue': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}getCacheExpirationValue`)),
        }
    },
}
