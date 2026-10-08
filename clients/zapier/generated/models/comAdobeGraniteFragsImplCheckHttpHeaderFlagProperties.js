const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}feature.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}feature.description`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}http.header.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}http.header.valuepattern`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'feature.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}feature.name`)),
            'feature.description': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}feature.description`)),
            'http.header.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}http.header.name`)),
            'http.header.valuepattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}http.header.valuepattern`)),
        }
    },
}
