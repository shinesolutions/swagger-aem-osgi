const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}default.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}max.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}default.period`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'default.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}default.timeout`)),
            'max.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}max.timeout`)),
            'default.period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}default.period`)),
        }
    },
}
