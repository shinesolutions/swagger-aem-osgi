const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}sling.servlet.resourceTypes`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.methods`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.selectors`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}download.config`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}view.selector`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}send_email`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.servlet.resourceTypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.servlet.resourceTypes`)),
            'sling.servlet.methods': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.methods`)),
            'sling.servlet.selectors': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.selectors`)),
            'download.config': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}download.config`)),
            'view.selector': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}view.selector`)),
            'send_email': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}send_email`)),
        }
    },
}
