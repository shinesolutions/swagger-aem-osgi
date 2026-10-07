const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}agentName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}diffPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}observedPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}serviceName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}propertyNames`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}distributionDelay`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}serviceUser.target`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
            'agentName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}agentName`)),
            'diffPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}diffPath`)),
            'observedPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}observedPath`)),
            'serviceName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}serviceName`)),
            'propertyNames': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}propertyNames`)),
            'distributionDelay': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}distributionDelay`)),
            'serviceUser.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}serviceUser.target`)),
        }
    },
}
