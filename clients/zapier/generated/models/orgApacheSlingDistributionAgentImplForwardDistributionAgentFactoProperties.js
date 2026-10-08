const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
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
            ...configNodePropertyBoolean.fields(`${keyPrefix}queue.processing.enabled`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}packageImporter.endpoints`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}passiveQueues`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}priorityQueues`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}retry.strategy`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}retry.attempts`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}requestAuthorizationStrategy.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}transportSecretProvider.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}packageBuilder.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}triggers.target`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}queue.provider`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}async.delivery`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}http.conn.timeout`, isInput),
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
            'queue.processing.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}queue.processing.enabled`)),
            'packageImporter.endpoints': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}packageImporter.endpoints`)),
            'passiveQueues': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}passiveQueues`)),
            'priorityQueues': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}priorityQueues`)),
            'retry.strategy': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}retry.strategy`)),
            'retry.attempts': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}retry.attempts`)),
            'requestAuthorizationStrategy.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}requestAuthorizationStrategy.target`)),
            'transportSecretProvider.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}transportSecretProvider.target`)),
            'packageBuilder.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}packageBuilder.target`)),
            'triggers.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}triggers.target`)),
            'queue.provider': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}queue.provider`)),
            'async.delivery': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}async.delivery`)),
            'http.conn.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}http.conn.timeout`)),
        }
    },
}
