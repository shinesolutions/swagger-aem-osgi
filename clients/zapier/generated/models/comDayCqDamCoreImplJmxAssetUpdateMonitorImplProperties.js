const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}jmx.objectname`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}active`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'jmx.objectname': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jmx.objectname`)),
            'active': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}active`)),
        }
    },
}
