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
            ...configNodePropertyString.fields(`${keyPrefix}importMode`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}aclHandling`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}package.roots`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}package.filters`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}property.filters`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}tempFsFolder`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}useBinaryReferences`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}autoSaveThreshold`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cleanupDelay`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}fileThreshold`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}MEGA_BYTES`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}useOffHeapMemory`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}digestAlgorithm`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}monitoringQueueSize`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}pathsMapping`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}strictImport`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}name`)),
            'type': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}type`)),
            'importMode': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}importMode`)),
            'aclHandling': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}aclHandling`)),
            'package.roots': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}package.roots`)),
            'package.filters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}package.filters`)),
            'property.filters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}property.filters`)),
            'tempFsFolder': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}tempFsFolder`)),
            'useBinaryReferences': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}useBinaryReferences`)),
            'autoSaveThreshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}autoSaveThreshold`)),
            'cleanupDelay': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cleanupDelay`)),
            'fileThreshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}fileThreshold`)),
            'MEGA_BYTES': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}MEGA_BYTES`)),
            'useOffHeapMemory': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}useOffHeapMemory`)),
            'digestAlgorithm': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}digestAlgorithm`)),
            'monitoringQueueSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}monitoringQueueSize`)),
            'pathsMapping': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}pathsMapping`)),
            'strictImport': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}strictImport`)),
        }
    },
}
