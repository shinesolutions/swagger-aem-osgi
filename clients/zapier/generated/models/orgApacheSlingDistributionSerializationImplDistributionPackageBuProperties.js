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
            ...configNodePropertyDropDown.fields(`${keyPrefix}type`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}format.target`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}tempFsFolder`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}fileThreshold`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}memoryUnit`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}useOffHeapMemory`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}digestAlgorithm`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}monitoringQueueSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cleanupDelay`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}package.filters`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}property.filters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'type': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}type`)),
            'format.target': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}format.target`)),
            'tempFsFolder': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}tempFsFolder`)),
            'fileThreshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}fileThreshold`)),
            'memoryUnit': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}memoryUnit`)),
            'useOffHeapMemory': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}useOffHeapMemory`)),
            'digestAlgorithm': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}digestAlgorithm`)),
            'monitoringQueueSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}monitoringQueueSize`)),
            'cleanupDelay': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cleanupDelay`)),
            'package.filters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}package.filters`)),
            'property.filters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}property.filters`)),
        }
    },
}
