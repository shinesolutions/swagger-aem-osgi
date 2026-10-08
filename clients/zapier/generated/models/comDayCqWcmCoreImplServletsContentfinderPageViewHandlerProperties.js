const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}guessTotal`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}tagTitleSearch`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'guessTotal': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}guessTotal`)),
            'tagTitleSearch': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}tagTitleSearch`)),
        }
    },
}
