const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}scheduler.expression`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}Duration for Temporary Storage`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}Duration for Anonymous Storage`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scheduler.expression': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scheduler.expression`)),
            'Duration for Temporary Storage': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}Duration for Temporary Storage`)),
            'Duration for Anonymous Storage': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}Duration for Anonymous Storage`)),
        }
    },
}
