const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}references`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}scripts`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'references': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}references`)),
            'scripts': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}scripts`)),
        }
    },
}
