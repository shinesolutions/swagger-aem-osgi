const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}jaas.controlFlag`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}jaas.ranking`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jaas.realmName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jaas.classname`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}jaas.options`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'jaas.controlFlag': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}jaas.controlFlag`)),
            'jaas.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}jaas.ranking`)),
            'jaas.realmName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jaas.realmName`)),
            'jaas.classname': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jaas.classname`)),
            'jaas.options': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}jaas.options`)),
        }
    },
}
