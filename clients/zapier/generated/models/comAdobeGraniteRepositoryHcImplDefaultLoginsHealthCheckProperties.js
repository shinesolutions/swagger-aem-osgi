const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}hc.tags`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}account.logins`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}console.logins`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hc.tags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}hc.tags`)),
            'account.logins': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}account.logins`)),
            'console.logins': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}console.logins`)),
        }
    },
}
