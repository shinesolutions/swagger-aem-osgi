const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}sling.servlet.selectors`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}ecmaSuport`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.servlet.selectors': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.servlet.selectors`)),
            'ecmaSuport': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}ecmaSuport`)),
        }
    },
}
