const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}service.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}privilege.name`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'service.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}service.name`)),
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'privilege.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}privilege.name`)),
        }
    },
}
