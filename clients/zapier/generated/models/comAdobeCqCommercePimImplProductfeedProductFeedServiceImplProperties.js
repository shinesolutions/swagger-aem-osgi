const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}Feed generator algorithm`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'Feed generator algorithm': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}Feed generator algorithm`)),
        }
    },
}
