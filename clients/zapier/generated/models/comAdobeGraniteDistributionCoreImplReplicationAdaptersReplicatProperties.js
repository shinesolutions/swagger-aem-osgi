const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}providerName`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}forward.requests`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'providerName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}providerName`)),
            'forward.requests': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}forward.requests`)),
        }
    },
}
