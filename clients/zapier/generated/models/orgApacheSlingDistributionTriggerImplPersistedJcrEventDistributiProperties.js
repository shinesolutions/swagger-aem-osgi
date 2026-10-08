const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}serviceName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}nuggetsPath`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'serviceName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}serviceName`)),
            'nuggetsPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}nuggetsPath`)),
        }
    },
}
