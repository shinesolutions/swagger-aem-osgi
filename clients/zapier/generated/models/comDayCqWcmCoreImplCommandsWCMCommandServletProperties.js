const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}wcmcommandservlet.delete_whitelist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'wcmcommandservlet.delete_whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}wcmcommandservlet.delete_whitelist`)),
        }
    },
}
