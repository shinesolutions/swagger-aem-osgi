const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}supportedLocales`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}Localizable Properties`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'supportedLocales': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}supportedLocales`)),
            'Localizable Properties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}Localizable Properties`)),
        }
    },
}
