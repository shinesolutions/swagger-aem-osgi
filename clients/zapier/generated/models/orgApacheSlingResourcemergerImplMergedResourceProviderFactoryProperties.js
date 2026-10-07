const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}merge.root`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}merge.readOnly`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'merge.root': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}merge.root`)),
            'merge.readOnly': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}merge.readOnly`)),
        }
    },
}
