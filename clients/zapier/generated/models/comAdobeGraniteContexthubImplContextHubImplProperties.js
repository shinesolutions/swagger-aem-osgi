const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}com.adobe.granite.contexthub.silent_mode`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}com.adobe.granite.contexthub.show_ui`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.adobe.granite.contexthub.silent_mode': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}com.adobe.granite.contexthub.silent_mode`)),
            'com.adobe.granite.contexthub.show_ui': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}com.adobe.granite.contexthub.show_ui`)),
        }
    },
}
