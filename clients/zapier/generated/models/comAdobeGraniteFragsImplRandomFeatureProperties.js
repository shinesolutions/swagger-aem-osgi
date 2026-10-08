const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}feature.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}feature.description`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}active.percentage`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cookie.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cookie.maxAge`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'feature.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}feature.name`)),
            'feature.description': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}feature.description`)),
            'active.percentage': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}active.percentage`)),
            'cookie.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cookie.name`)),
            'cookie.maxAge': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cookie.maxAge`)),
        }
    },
}
