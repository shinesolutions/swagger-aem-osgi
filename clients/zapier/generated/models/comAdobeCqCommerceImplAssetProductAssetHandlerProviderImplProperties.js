const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}cq.commerce.asset.handler.fallback`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.commerce.asset.handler.fallback': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.commerce.asset.handler.fallback`)),
        }
    },
}
