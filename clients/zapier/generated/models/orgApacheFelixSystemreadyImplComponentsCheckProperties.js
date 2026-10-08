const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}components.list`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}type`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'components.list': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}components.list`)),
            'type': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}type`)),
        }
    },
}
