const utils = require('../utils/utils');
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
            ...configNodePropertyBoolean.fields(`${keyPrefix}queue.processing.enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}packageExporter.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}packageImporter.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}requestAuthorizationStrategy.target`, isInput),
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
            'packageExporter.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}packageExporter.target`)),
            'packageImporter.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}packageImporter.target`)),
            'requestAuthorizationStrategy.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}requestAuthorizationStrategy.target`)),
            'triggers.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}triggers.target`)),
        }
    },
}
