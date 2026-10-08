const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}link.expired.prefix`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}link.expired.remove`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}link.expired.suffix`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}link.invalid.prefix`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}link.invalid.remove`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}link.invalid.suffix`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}link.predated.prefix`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}link.predated.remove`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}link.predated.suffix`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}link.wcmmodes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'link.expired.prefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}link.expired.prefix`)),
            'link.expired.remove': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}link.expired.remove`)),
            'link.expired.suffix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}link.expired.suffix`)),
            'link.invalid.prefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}link.invalid.prefix`)),
            'link.invalid.remove': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}link.invalid.remove`)),
            'link.invalid.suffix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}link.invalid.suffix`)),
            'link.predated.prefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}link.predated.prefix`)),
            'link.predated.remove': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}link.predated.remove`)),
            'link.predated.suffix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}link.predated.suffix`)),
            'link.wcmmodes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}link.wcmmodes`)),
        }
    },
}
