const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}service.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.resourceTypes`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.selectors`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}sling.servlet.methods`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}forms.formchooserservlet.advansesearch.require`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'service.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}service.name`)),
            'sling.servlet.resourceTypes': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.resourceTypes`)),
            'sling.servlet.selectors': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.selectors`)),
            'sling.servlet.methods': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.servlet.methods`)),
            'forms.formchooserservlet.advansesearch.require': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}forms.formchooserservlet.advansesearch.require`)),
        }
    },
}
