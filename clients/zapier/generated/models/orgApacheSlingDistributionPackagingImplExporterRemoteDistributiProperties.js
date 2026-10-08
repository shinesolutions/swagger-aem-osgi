const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}endpoints`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}pull.items`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}packageBuilder.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}transportSecretProvider.target`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'endpoints': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}endpoints`)),
            'pull.items': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}pull.items`)),
            'packageBuilder.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}packageBuilder.target`)),
            'transportSecretProvider.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}transportSecretProvider.target`)),
        }
    },
}
