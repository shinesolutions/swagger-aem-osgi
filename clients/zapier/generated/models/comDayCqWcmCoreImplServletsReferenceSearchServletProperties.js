const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}referencesearchservlet.maxReferencesPerPage`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}referencesearchservlet.maxPages`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'referencesearchservlet.maxReferencesPerPage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}referencesearchservlet.maxReferencesPerPage`)),
            'referencesearchservlet.maxPages': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}referencesearchservlet.maxPages`)),
        }
    },
}
