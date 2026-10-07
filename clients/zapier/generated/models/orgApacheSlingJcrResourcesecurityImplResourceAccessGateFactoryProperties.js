const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}checkpath.prefix`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jcrPath`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'checkpath.prefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}checkpath.prefix`)),
            'jcrPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jcrPath`)),
        }
    },
}
