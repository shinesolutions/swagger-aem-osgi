--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties`
--
SELECT `repository.home`, `tarmk.mode`, `tarmk.size`, `segmentCache.size`, `stringCache.size`, `templateCache.size`, `stringDeduplicationCache.size`, `templateDeduplicationCache.size`, `nodeDeduplicationCache.size`, `pauseCompaction`, `compaction.retryCount`, `compaction.force.timeout`, `compaction.sizeDeltaEstimation`, `compaction.disableEstimation`, `compaction.retainedGenerations`, `compaction.memoryThreshold`, `compaction.progressLog`, `standby`, `customBlobStore`, `customSegmentStore`, `splitPersistence`, `repository.backup.dir`, `blobGcMaxAgeInSecs`, `blobTrackSnapshotIntervalInSecs`, `role`, `registerDescriptors`, `dispatchChanges` FROM `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties`
--
INSERT INTO `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties`(`repository.home`, `tarmk.mode`, `tarmk.size`, `segmentCache.size`, `stringCache.size`, `templateCache.size`, `stringDeduplicationCache.size`, `templateDeduplicationCache.size`, `nodeDeduplicationCache.size`, `pauseCompaction`, `compaction.retryCount`, `compaction.force.timeout`, `compaction.sizeDeltaEstimation`, `compaction.disableEstimation`, `compaction.retainedGenerations`, `compaction.memoryThreshold`, `compaction.progressLog`, `standby`, `customBlobStore`, `customSegmentStore`, `splitPersistence`, `repository.backup.dir`, `blobGcMaxAgeInSecs`, `blobTrackSnapshotIntervalInSecs`, `role`, `registerDescriptors`, `dispatchChanges`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties`
--
UPDATE `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties` SET `repository.home` = ?, `tarmk.mode` = ?, `tarmk.size` = ?, `segmentCache.size` = ?, `stringCache.size` = ?, `templateCache.size` = ?, `stringDeduplicationCache.size` = ?, `templateDeduplicationCache.size` = ?, `nodeDeduplicationCache.size` = ?, `pauseCompaction` = ?, `compaction.retryCount` = ?, `compaction.force.timeout` = ?, `compaction.sizeDeltaEstimation` = ?, `compaction.disableEstimation` = ?, `compaction.retainedGenerations` = ?, `compaction.memoryThreshold` = ?, `compaction.progressLog` = ?, `standby` = ?, `customBlobStore` = ?, `customSegmentStore` = ?, `splitPersistence` = ?, `repository.backup.dir` = ?, `blobGcMaxAgeInSecs` = ?, `blobTrackSnapshotIntervalInSecs` = ?, `role` = ?, `registerDescriptors` = ?, `dispatchChanges` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties`
--
DELETE FROM `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties` WHERE 0;

