const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}query.limit`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}file.type.extension.map`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'query.limit': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}query.limit`)),
            'file.type.extension.map': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}file.type.extension.map`)),
        }
    },
}
