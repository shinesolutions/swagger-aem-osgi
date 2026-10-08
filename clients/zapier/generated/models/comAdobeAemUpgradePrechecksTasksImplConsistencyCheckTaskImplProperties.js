const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}root.path`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}fix.inconsistencies`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'root.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}root.path`)),
            'fix.inconsistencies': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}fix.inconsistencies`)),
        }
    },
}
