const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}forcelocation`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'forcelocation': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}forcelocation`)),
        }
    },
}
