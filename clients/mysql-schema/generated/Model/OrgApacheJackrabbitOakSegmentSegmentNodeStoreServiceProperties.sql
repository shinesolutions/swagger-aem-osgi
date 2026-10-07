--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties`
--
SELECT `repository.home`, `tarmk.mode`, `tarmk.size`, `segmentCache.size`, `stringCache.size`, `templateCache.size`, `stringDeduplicationCache.size`, `templateDeduplicationCache.size`, `nodeDeduplicationCache.size`, `pauseCompaction`, `compaction.retryCount`, `compaction.force.timeout`, `compaction.sizeDeltaEstimation`, `compaction.disableEstimation`, `compaction.retainedGenerations`, `compaction.memoryThreshold`, `compaction.progressLog`, `standby`, `customBlobStore`, `customSegmentStore`, `splitPersistence`, `repository.backup.dir`, `blobGcMaxAgeInSecs`, `blobTrackSnapshotIntervalInSecs` FROM `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties`
--
INSERT INTO `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties`(`repository.home`, `tarmk.mode`, `tarmk.size`, `segmentCache.size`, `stringCache.size`, `templateCache.size`, `stringDeduplicationCache.size`, `templateDeduplicationCache.size`, `nodeDeduplicationCache.size`, `pauseCompaction`, `compaction.retryCount`, `compaction.force.timeout`, `compaction.sizeDeltaEstimation`, `compaction.disableEstimation`, `compaction.retainedGenerations`, `compaction.memoryThreshold`, `compaction.progressLog`, `standby`, `customBlobStore`, `customSegmentStore`, `splitPersistence`, `repository.backup.dir`, `blobGcMaxAgeInSecs`, `blobTrackSnapshotIntervalInSecs`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties`
--
UPDATE `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties` SET `repository.home` = ?, `tarmk.mode` = ?, `tarmk.size` = ?, `segmentCache.size` = ?, `stringCache.size` = ?, `templateCache.size` = ?, `stringDeduplicationCache.size` = ?, `templateDeduplicationCache.size` = ?, `nodeDeduplicationCache.size` = ?, `pauseCompaction` = ?, `compaction.retryCount` = ?, `compaction.force.timeout` = ?, `compaction.sizeDeltaEstimation` = ?, `compaction.disableEstimation` = ?, `compaction.retainedGenerations` = ?, `compaction.memoryThreshold` = ?, `compaction.progressLog` = ?, `standby` = ?, `customBlobStore` = ?, `customSegmentStore` = ?, `splitPersistence` = ?, `repository.backup.dir` = ?, `blobGcMaxAgeInSecs` = ?, `blobTrackSnapshotIntervalInSecs` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties`
--
DELETE FROM `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties` WHERE 0;

