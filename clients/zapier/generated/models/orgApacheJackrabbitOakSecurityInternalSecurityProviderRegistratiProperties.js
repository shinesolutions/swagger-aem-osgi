const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}requiredServicePids`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}authorizationCompositionType`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'requiredServicePids': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}requiredServicePids`)),
            'authorizationCompositionType': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}authorizationCompositionType`)),
        }
    },
}
