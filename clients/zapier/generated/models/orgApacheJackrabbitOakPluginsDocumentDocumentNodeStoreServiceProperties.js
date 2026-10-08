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
            ...configNodePropertyString.fields(`${keyPrefix}mongouri`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}db`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}socketKeepAlive`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cache`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}nodeCachePercentage`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}prevDocCachePercentage`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}childrenCachePercentage`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}diffCachePercentage`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cacheSegmentCount`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cacheStackMoveDistance`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}blobCacheSize`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}persistentCache`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}journalCache`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}customBlobStore`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}journalGCInterval`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}journalGCMaxAge`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}prefetchExternalChanges`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}role`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}versionGcMaxAgeInSecs`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}versionGCExpression`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}versionGCTimeLimitInSecs`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}blobGcMaxAgeInSecs`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}blobTrackSnapshotIntervalInSecs`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}repository.home`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxReplicationLagInSecs`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}documentStoreType`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}bundlingDisabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}updateLimit`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}persistentCacheIncludes`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}leaseCheckMode`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'mongouri': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}mongouri`)),
            'db': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}db`)),
            'socketKeepAlive': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}socketKeepAlive`)),
            'cache': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cache`)),
            'nodeCachePercentage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}nodeCachePercentage`)),
            'prevDocCachePercentage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}prevDocCachePercentage`)),
            'childrenCachePercentage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}childrenCachePercentage`)),
            'diffCachePercentage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}diffCachePercentage`)),
            'cacheSegmentCount': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cacheSegmentCount`)),
            'cacheStackMoveDistance': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cacheStackMoveDistance`)),
            'blobCacheSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}blobCacheSize`)),
            'persistentCache': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}persistentCache`)),
            'journalCache': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}journalCache`)),
            'customBlobStore': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}customBlobStore`)),
            'journalGCInterval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}journalGCInterval`)),
            'journalGCMaxAge': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}journalGCMaxAge`)),
            'prefetchExternalChanges': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}prefetchExternalChanges`)),
            'role': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}role`)),
            'versionGcMaxAgeInSecs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}versionGcMaxAgeInSecs`)),
            'versionGCExpression': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}versionGCExpression`)),
            'versionGCTimeLimitInSecs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}versionGCTimeLimitInSecs`)),
            'blobGcMaxAgeInSecs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}blobGcMaxAgeInSecs`)),
            'blobTrackSnapshotIntervalInSecs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}blobTrackSnapshotIntervalInSecs`)),
            'repository.home': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}repository.home`)),
            'maxReplicationLagInSecs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxReplicationLagInSecs`)),
            'documentStoreType': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}documentStoreType`)),
            'bundlingDisabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}bundlingDisabled`)),
            'updateLimit': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}updateLimit`)),
            'persistentCacheIncludes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}persistentCacheIncludes`)),
            'leaseCheckMode': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}leaseCheckMode`)),
        }
    },
}
