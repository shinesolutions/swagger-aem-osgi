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
            ...configNodePropertyBoolean.fields(`${keyPrefix}queue.processing.enabled`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}packageExporter.endpoints`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}pull.items`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}http.conn.timeout`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}requestAuthorizationStrategy.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}transportSecretProvider.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}packageBuilder.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}triggers.target`, isInput),
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
            'queue.processing.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}queue.processing.enabled`)),
            'packageExporter.endpoints': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}packageExporter.endpoints`)),
            'pull.items': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}pull.items`)),
            'http.conn.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}http.conn.timeout`)),
            'requestAuthorizationStrategy.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}requestAuthorizationStrategy.target`)),
            'transportSecretProvider.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}transportSecretProvider.target`)),
            'packageBuilder.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}packageBuilder.target`)),
            'triggers.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}triggers.target`)),
        }
    },
}
