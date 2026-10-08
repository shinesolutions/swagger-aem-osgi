const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}extension.order`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}flush.forumontopic`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'extension.order': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}extension.order`)),
            'flush.forumontopic': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}flush.forumontopic`)),
        }
    },
}
