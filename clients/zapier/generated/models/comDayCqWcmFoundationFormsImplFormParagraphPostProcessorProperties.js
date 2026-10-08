const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}forms.formparagraphpostprocessor.enabled`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}forms.formparagraphpostprocessor.formresourcetypes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'forms.formparagraphpostprocessor.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}forms.formparagraphpostprocessor.enabled`)),
            'forms.formparagraphpostprocessor.formresourcetypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}forms.formparagraphpostprocessor.formresourcetypes`)),
        }
    },
}
