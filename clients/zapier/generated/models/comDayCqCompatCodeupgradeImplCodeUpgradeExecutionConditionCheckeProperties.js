const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}codeupgradetasks`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}codeupgradetaskfilters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'codeupgradetasks': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}codeupgradetasks`)),
            'codeupgradetaskfilters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}codeupgradetaskfilters`)),
        }
    },
}
