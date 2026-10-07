const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}experience.indirection`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}touchpoint.indirection`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'experience.indirection': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}experience.indirection`)),
            'touchpoint.indirection': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}touchpoint.indirection`)),
        }
    },
}
