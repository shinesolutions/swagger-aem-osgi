const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}endpoints`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}transportSecretProvider.target`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'endpoints': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}endpoints`)),
            'transportSecretProvider.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}transportSecretProvider.target`)),
        }
    },
}
