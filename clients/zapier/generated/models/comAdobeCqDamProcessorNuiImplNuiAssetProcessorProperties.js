const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}nuiEnabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}nuiServiceUrl`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}nuiApiKey`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'nuiEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}nuiEnabled`)),
            'nuiServiceUrl': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}nuiServiceUrl`)),
            'nuiApiKey': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}nuiApiKey`)),
        }
    },
}
