const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}workspace`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}dimensions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'workspace': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}workspace`)),
            'dimensions': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}dimensions`)),
        }
    },
}
