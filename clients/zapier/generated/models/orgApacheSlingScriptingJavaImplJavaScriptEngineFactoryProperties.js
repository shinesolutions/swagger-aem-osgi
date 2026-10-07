const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}java.classdebuginfo`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}java.javaEncoding`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}java.compilerSourceVM`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}java.compilerTargetVM`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'java.classdebuginfo': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}java.classdebuginfo`)),
            'java.javaEncoding': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}java.javaEncoding`)),
            'java.compilerSourceVM': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}java.compilerSourceVM`)),
            'java.compilerTargetVM': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}java.compilerTargetVM`)),
        }
    },
}
