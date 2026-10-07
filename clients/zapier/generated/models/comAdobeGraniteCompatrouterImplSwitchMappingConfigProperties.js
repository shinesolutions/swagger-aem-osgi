const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}group`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}ids`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'group': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}group`)),
            'ids': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}ids`)),
        }
    },
}
