const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}formsManagerConfig.includeOOTBTemplates`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}formsManagerConfig.includeDeprecatedTemplates`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'formsManagerConfig.includeOOTBTemplates': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}formsManagerConfig.includeOOTBTemplates`)),
            'formsManagerConfig.includeDeprecatedTemplates': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}formsManagerConfig.includeDeprecatedTemplates`)),
        }
    },
}
