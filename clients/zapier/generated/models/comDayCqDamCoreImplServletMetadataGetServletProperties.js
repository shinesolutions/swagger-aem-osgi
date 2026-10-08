const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.resourceTypes`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.methods`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.extensions`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.selectors`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.servlet.resourceTypes': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.resourceTypes`)),
            'sling.servlet.methods': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.methods`)),
            'sling.servlet.extensions': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.extensions`)),
            'sling.servlet.selectors': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.selectors`)),
        }
    },
}
