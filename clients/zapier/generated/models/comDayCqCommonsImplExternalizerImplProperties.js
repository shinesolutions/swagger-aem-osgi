const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}externalizer.domains`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}externalizer.host`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}externalizer.contextpath`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}externalizer.encodedpath`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'externalizer.domains': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}externalizer.domains`)),
            'externalizer.host': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}externalizer.host`)),
            'externalizer.contextpath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}externalizer.contextpath`)),
            'externalizer.encodedpath': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}externalizer.encodedpath`)),
        }
    },
}
