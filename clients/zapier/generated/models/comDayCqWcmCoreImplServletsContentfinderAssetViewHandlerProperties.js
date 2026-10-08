const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}dam.showexpired`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}dam.showhidden`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}tagTitleSearch`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}guessTotal`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}dam.expiryProperty`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dam.showexpired': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}dam.showexpired`)),
            'dam.showhidden': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}dam.showhidden`)),
            'tagTitleSearch': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}tagTitleSearch`)),
            'guessTotal': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}guessTotal`)),
            'dam.expiryProperty': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}dam.expiryProperty`)),
        }
    },
}
