const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}locale`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}imsConfig`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'locale': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}locale`)),
            'imsConfig': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}imsConfig`)),
        }
    },
}
