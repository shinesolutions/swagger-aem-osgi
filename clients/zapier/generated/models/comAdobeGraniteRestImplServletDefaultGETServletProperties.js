const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}default.limit`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}use.absolute.uri`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'default.limit': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}default.limit`)),
            'use.absolute.uri': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}use.absolute.uri`)),
        }
    },
}
