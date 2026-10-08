const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}username`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}encryptedPassword`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'username': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}username`)),
            'encryptedPassword': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}encryptedPassword`)),
        }
    },
}
