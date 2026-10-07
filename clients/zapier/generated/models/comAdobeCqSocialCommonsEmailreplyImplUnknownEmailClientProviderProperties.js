const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}replyEmailPatterns`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}priorityOrder`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'replyEmailPatterns': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}replyEmailPatterns`)),
            'priorityOrder': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}priorityOrder`)),
        }
    },
}
