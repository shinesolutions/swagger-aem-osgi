const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}id`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}compatPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}newPath`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}id`)),
            'compatPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}compatPath`)),
            'newPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}newPath`)),
        }
    },
}
