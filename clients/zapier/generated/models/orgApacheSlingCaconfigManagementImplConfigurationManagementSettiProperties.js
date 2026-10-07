const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}ignorePropertyNameRegex`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}configCollectionPropertiesResourceNames`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ignorePropertyNameRegex': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}ignorePropertyNameRegex`)),
            'configCollectionPropertiesResourceNames': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}configCollectionPropertiesResourceNames`)),
        }
    },
}
