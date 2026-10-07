const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}process.label`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.dam.enable.sha1`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.dam.metadata.xssprotected.properties`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'process.label': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}process.label`)),
            'cq.dam.enable.sha1': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.dam.enable.sha1`)),
            'cq.dam.metadata.xssprotected.properties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.dam.metadata.xssprotected.properties`)),
        }
    },
}
