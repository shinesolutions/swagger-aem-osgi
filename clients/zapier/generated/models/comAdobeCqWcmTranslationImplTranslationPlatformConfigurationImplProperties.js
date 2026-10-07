const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}syncTranslationState.schedulingFormat`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}schedulingRepeatTranslation.schedulingFormat`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}syncTranslationState.lockTimeoutInMinutes`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}export.format`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'syncTranslationState.schedulingFormat': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}syncTranslationState.schedulingFormat`)),
            'schedulingRepeatTranslation.schedulingFormat': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}schedulingRepeatTranslation.schedulingFormat`)),
            'syncTranslationState.lockTimeoutInMinutes': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}syncTranslationState.lockTimeoutInMinutes`)),
            'export.format': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}export.format`)),
        }
    },
}
