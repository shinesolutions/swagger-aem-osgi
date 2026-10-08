const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}sling.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sling.description`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.name`)),
            'sling.description': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.description`)),
        }
    },
}
