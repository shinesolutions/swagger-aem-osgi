const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}period`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}timeUnit`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}level`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}loggerName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}prefix`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pattern`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}registryName`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}period`)),
            'timeUnit': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}timeUnit`)),
            'level': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}level`)),
            'loggerName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}loggerName`)),
            'prefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}prefix`)),
            'pattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pattern`)),
            'registryName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}registryName`)),
        }
    },
}
