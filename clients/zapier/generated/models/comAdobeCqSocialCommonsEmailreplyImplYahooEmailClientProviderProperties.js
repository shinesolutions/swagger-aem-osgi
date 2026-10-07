const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}priorityOrder`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}replyEmailPatterns`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'priorityOrder': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}priorityOrder`)),
            'replyEmailPatterns': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}replyEmailPatterns`)),
        }
    },
}
