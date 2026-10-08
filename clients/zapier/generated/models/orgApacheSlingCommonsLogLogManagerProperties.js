const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}org.apache.sling.commons.log.level`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.commons.log.file`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}org.apache.sling.commons.log.file.number`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.commons.log.file.size`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.commons.log.pattern`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.commons.log.configurationFile`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}org.apache.sling.commons.log.packagingDataEnabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}org.apache.sling.commons.log.maxCallerDataDepth`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}org.apache.sling.commons.log.maxOldFileCountInDump`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}org.apache.sling.commons.log.numOfLines`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'org.apache.sling.commons.log.level': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.level`)),
            'org.apache.sling.commons.log.file': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.file`)),
            'org.apache.sling.commons.log.file.number': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.file.number`)),
            'org.apache.sling.commons.log.file.size': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.file.size`)),
            'org.apache.sling.commons.log.pattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.pattern`)),
            'org.apache.sling.commons.log.configurationFile': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.configurationFile`)),
            'org.apache.sling.commons.log.packagingDataEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.packagingDataEnabled`)),
            'org.apache.sling.commons.log.maxCallerDataDepth': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.maxCallerDataDepth`)),
            'org.apache.sling.commons.log.maxOldFileCountInDump': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.maxOldFileCountInDump`)),
            'org.apache.sling.commons.log.numOfLines': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}org.apache.sling.commons.log.numOfLines`)),
        }
    },
}
