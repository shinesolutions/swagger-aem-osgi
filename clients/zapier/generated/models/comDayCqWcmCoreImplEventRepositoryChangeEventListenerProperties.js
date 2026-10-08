const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}paths`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}excludedPaths`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}paths`)),
            'excludedPaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}excludedPaths`)),
        }
    },
}
