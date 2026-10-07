const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}contentsync.fallback.authorizable`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}contentsync.fallback.updateuser`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'contentsync.fallback.authorizable': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}contentsync.fallback.authorizable`)),
            'contentsync.fallback.updateuser': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}contentsync.fallback.updateuser`)),
        }
    },
}
