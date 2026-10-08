const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}default.attachment.type.blacklist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}baseline.attachment.type.blacklist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'default.attachment.type.blacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}default.attachment.type.blacklist`)),
            'baseline.attachment.type.blacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}baseline.attachment.type.blacklist`)),
        }
    },
}
