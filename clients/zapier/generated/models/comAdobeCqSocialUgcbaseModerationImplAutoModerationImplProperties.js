const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}automoderation.sequence`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}automoderation.onfailurestop`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'automoderation.sequence': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}automoderation.sequence`)),
            'automoderation.onfailurestop': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}automoderation.onfailurestop`)),
        }
    },
}
