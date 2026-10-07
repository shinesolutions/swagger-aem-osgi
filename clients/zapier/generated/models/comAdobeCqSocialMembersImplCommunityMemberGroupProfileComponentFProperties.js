const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}everyoneLimit`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}priority`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'everyoneLimit': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}everyoneLimit`)),
            'priority': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}priority`)),
        }
    },
}
