const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.resourceTypes`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.selectors`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}resource.whitelist`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}resource.blacklist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.servlet.resourceTypes': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.resourceTypes`)),
            'sling.servlet.selectors': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.selectors`)),
            'resource.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resource.whitelist`)),
            'resource.blacklist': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}resource.blacklist`)),
        }
    },
}
