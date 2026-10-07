const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}type.collections`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}type.noncollections`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}type.content`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
            'type.collections': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}type.collections`)),
            'type.noncollections': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}type.noncollections`)),
            'type.content': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}type.content`)),
        }
    },
}
