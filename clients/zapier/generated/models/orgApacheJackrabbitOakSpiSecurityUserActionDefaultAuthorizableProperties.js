const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}enabledActions`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}userPrivilegeNames`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}groupPrivilegeNames`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}constraint`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enabledActions': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}enabledActions`)),
            'userPrivilegeNames': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}userPrivilegeNames`)),
            'groupPrivilegeNames': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}groupPrivilegeNames`)),
            'constraint': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}constraint`)),
        }
    },
}
