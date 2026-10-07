const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}sling.servlet.resourceTypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}sling.servlet.methods`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.dam.drm.enable`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.servlet.resourceTypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.servlet.resourceTypes`)),
            'sling.servlet.methods': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.servlet.methods`)),
            'cq.dam.drm.enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.dam.drm.enable`)),
        }
    },
}
