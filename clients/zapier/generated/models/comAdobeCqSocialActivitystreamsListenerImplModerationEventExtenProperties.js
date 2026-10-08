const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}accepted`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}ranked`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'accepted': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}accepted`)),
            'ranked': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}ranked`)),
        }
    },
}
