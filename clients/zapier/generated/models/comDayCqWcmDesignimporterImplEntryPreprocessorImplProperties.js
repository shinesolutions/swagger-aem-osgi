const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}search.pattern`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}replace.pattern`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'search.pattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}search.pattern`)),
            'replace.pattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}replace.pattern`)),
        }
    },
}
