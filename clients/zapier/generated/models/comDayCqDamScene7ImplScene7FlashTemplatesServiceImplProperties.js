const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}scene7FlashTemplates.rti`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}scene7FlashTemplates.rsi`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}scene7FlashTemplates.rb`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}scene7FlashTemplates.rurl`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}scene7FlashTemplate.urlFormatParameter`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scene7FlashTemplates.rti': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scene7FlashTemplates.rti`)),
            'scene7FlashTemplates.rsi': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scene7FlashTemplates.rsi`)),
            'scene7FlashTemplates.rb': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scene7FlashTemplates.rb`)),
            'scene7FlashTemplates.rurl': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scene7FlashTemplates.rurl`)),
            'scene7FlashTemplate.urlFormatParameter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scene7FlashTemplate.urlFormatParameter`)),
        }
    },
}
