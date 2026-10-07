const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}hc.tags`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}dispatcher.address`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}dispatcher.filter.allowed`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}dispatcher.filter.blocked`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hc.tags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}hc.tags`)),
            'dispatcher.address': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}dispatcher.address`)),
            'dispatcher.filter.allowed': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}dispatcher.filter.allowed`)),
            'dispatcher.filter.blocked': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}dispatcher.filter.blocked`)),
        }
    },
}
