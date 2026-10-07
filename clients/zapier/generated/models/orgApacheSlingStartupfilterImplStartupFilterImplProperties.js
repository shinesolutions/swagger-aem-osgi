const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}active.by.default`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}default.message`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'active.by.default': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}active.by.default`)),
            'default.message': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}default.message`)),
        }
    },
}
