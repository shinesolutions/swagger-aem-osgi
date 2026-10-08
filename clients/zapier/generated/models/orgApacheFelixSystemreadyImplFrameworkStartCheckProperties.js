const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}target.start.level`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}target.start.level.prop.name`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}type`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}timeout`)),
            'target.start.level': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}target.start.level`)),
            'target.start.level.prop.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}target.start.level.prop.name`)),
            'type': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}type`)),
        }
    },
}
