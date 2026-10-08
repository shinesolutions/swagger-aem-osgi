const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}sling.servlet.paths`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}sling.servlet.methods`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.dam.enable.anonymous`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.servlet.paths': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.servlet.paths`)),
            'sling.servlet.methods': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sling.servlet.methods`)),
            'cq.dam.enable.anonymous': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.dam.enable.anonymous`)),
        }
    },
}
