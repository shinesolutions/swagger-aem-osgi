const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}alias`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}dav.create-absolute-uri`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}dav.protectedhandlers`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'alias': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}alias`)),
            'dav.create-absolute-uri': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}dav.create-absolute-uri`)),
            'dav.protectedhandlers': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}dav.protectedhandlers`)),
        }
    },
}
