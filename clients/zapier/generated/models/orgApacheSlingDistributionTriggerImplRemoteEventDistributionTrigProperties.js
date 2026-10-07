const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}endpoint`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}transportSecretProvider.target`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'endpoint': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}endpoint`)),
            'transportSecretProvider.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}transportSecretProvider.target`)),
        }
    },
}
