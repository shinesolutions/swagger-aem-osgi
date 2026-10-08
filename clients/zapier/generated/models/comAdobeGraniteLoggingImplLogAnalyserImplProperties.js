const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}messages.queue.size`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}logger.config`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}messages.size`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'messages.queue.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}messages.queue.size`)),
            'logger.config': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}logger.config`)),
            'messages.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}messages.size`)),
        }
    },
}
