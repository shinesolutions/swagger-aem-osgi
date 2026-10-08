const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}title`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}details`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}serviceName`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}log.level`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}allowed.roots`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}requestAuthorizationStrategy.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}queueProviderFactory.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}packageBuilder.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}triggers.target`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}priorityQueues`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'title': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}title`)),
            'details': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}details`)),
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
            'serviceName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}serviceName`)),
            'log.level': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}log.level`)),
            'allowed.roots': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}allowed.roots`)),
            'requestAuthorizationStrategy.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}requestAuthorizationStrategy.target`)),
            'queueProviderFactory.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}queueProviderFactory.target`)),
            'packageBuilder.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}packageBuilder.target`)),
            'triggers.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}triggers.target`)),
            'priorityQueues': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}priorityQueues`)),
        }
    },
}
