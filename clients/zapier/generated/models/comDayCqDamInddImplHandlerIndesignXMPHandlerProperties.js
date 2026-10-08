const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}process.label`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}extract.pages`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'process.label': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}process.label`)),
            'extract.pages': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}extract.pages`)),
        }
    },
}
