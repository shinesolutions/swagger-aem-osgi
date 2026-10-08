const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}csrf.token.expires.in`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.auth.requirements`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'csrf.token.expires.in': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}csrf.token.expires.in`)),
            'sling.auth.requirements': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.auth.requirements`)),
        }
    },
}
