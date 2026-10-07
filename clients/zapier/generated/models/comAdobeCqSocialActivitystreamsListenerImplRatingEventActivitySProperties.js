const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}ranking`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}ranking`)),
            'enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable`)),
        }
    },
}
