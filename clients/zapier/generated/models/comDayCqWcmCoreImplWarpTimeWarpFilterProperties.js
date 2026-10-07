const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}filter.order`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}filter.scope`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'filter.order': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}filter.order`)),
            'filter.scope': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}filter.scope`)),
        }
    },
}
