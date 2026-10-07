const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}disabled.cipher.suites`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}enabled.cipher.suites`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'disabled.cipher.suites': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}disabled.cipher.suites`)),
            'enabled.cipher.suites': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}enabled.cipher.suites`)),
        }
    },
}
