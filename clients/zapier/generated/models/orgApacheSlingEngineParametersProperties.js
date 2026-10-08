const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}sling.default.parameter.encoding`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}sling.default.max.parameters`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}file.location`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}file.threshold`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}file.max`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}request.max`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}sling.default.parameter.checkForAdditionalContainerParameters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'sling.default.parameter.encoding': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sling.default.parameter.encoding`)),
            'sling.default.max.parameters': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}sling.default.max.parameters`)),
            'file.location': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}file.location`)),
            'file.threshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}file.threshold`)),
            'file.max': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}file.max`)),
            'request.max': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}request.max`)),
            'sling.default.parameter.checkForAdditionalContainerParameters': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}sling.default.parameter.checkForAdditionalContainerParameters`)),
        }
    },
}
