const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}repository.home`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}tarmk.mode`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}tarmk.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}segmentCache.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}stringCache.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}templateCache.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}stringDeduplicationCache.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}templateDeduplicationCache.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}nodeDeduplicationCache.size`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}pauseCompaction`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}compaction.retryCount`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}compaction.force.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}compaction.sizeDeltaEstimation`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}compaction.disableEstimation`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}compaction.retainedGenerations`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}compaction.memoryThreshold`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}compaction.progressLog`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}standby`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}customBlobStore`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}customSegmentStore`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}splitPersistence`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}repository.backup.dir`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}blobGcMaxAgeInSecs`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}blobTrackSnapshotIntervalInSecs`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'repository.home': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}repository.home`)),
            'tarmk.mode': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}tarmk.mode`)),
            'tarmk.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}tarmk.size`)),
            'segmentCache.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}segmentCache.size`)),
            'stringCache.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}stringCache.size`)),
            'templateCache.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}templateCache.size`)),
            'stringDeduplicationCache.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}stringDeduplicationCache.size`)),
            'templateDeduplicationCache.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}templateDeduplicationCache.size`)),
            'nodeDeduplicationCache.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}nodeDeduplicationCache.size`)),
            'pauseCompaction': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}pauseCompaction`)),
            'compaction.retryCount': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}compaction.retryCount`)),
            'compaction.force.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}compaction.force.timeout`)),
            'compaction.sizeDeltaEstimation': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}compaction.sizeDeltaEstimation`)),
            'compaction.disableEstimation': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}compaction.disableEstimation`)),
            'compaction.retainedGenerations': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}compaction.retainedGenerations`)),
            'compaction.memoryThreshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}compaction.memoryThreshold`)),
            'compaction.progressLog': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}compaction.progressLog`)),
            'standby': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}standby`)),
            'customBlobStore': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}customBlobStore`)),
            'customSegmentStore': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}customSegmentStore`)),
            'splitPersistence': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}splitPersistence`)),
            'repository.backup.dir': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}repository.backup.dir`)),
            'blobGcMaxAgeInSecs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}blobGcMaxAgeInSecs`)),
            'blobTrackSnapshotIntervalInSecs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}blobTrackSnapshotIntervalInSecs`)),
        }
    },
}
