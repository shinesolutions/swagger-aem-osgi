const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}sling.servlet.methods`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.paths`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.servlet.methods': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.servlet.methods`)),
            'sling.servlet.paths': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.paths`)),
        }
    },
}
