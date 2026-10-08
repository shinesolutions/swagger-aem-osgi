const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}ignoredPathsPatterns`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}serviceName`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}deep`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
            'ignoredPathsPatterns': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}ignoredPathsPatterns`)),
            'serviceName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}serviceName`)),
            'deep': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}deep`)),
        }
    },
}
