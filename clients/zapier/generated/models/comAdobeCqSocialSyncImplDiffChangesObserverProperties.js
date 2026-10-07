const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}agentName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}diffPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}propertyNames`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
            'agentName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}agentName`)),
            'diffPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}diffPath`)),
            'propertyNames': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}propertyNames`)),
        }
    },
}
