const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}endpointUri`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}connectionTimeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}socketTimeout`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'endpointUri': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}endpointUri`)),
            'connectionTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}connectionTimeout`)),
            'socketTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}socketTimeout`)),
        }
    },
}
