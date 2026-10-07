--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePro`
--
SELECT `mongouri`, `db`, `socketKeepAlive`, `cache`, `nodeCachePercentage`, `prevDocCachePercentage`, `childrenCachePercentage`, `diffCachePercentage`, `cacheSegmentCount`, `cacheStackMoveDistance`, `blobCacheSize`, `persistentCache`, `journalCache`, `customBlobStore`, `journalGCInterval`, `journalGCMaxAge`, `prefetchExternalChanges`, `role`, `versionGcMaxAgeInSecs`, `versionGCExpression`, `versionGCTimeLimitInSecs`, `blobGcMaxAgeInSecs`, `blobTrackSnapshotIntervalInSecs`, `repository.home`, `maxReplicationLagInSecs`, `documentStoreType`, `bundlingDisabled`, `updateLimit`, `persistentCacheIncludes`, `leaseCheckMode` FROM `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePro` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePro`
--
INSERT INTO `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePro`(`mongouri`, `db`, `socketKeepAlive`, `cache`, `nodeCachePercentage`, `prevDocCachePercentage`, `childrenCachePercentage`, `diffCachePercentage`, `cacheSegmentCount`, `cacheStackMoveDistance`, `blobCacheSize`, `persistentCache`, `journalCache`, `customBlobStore`, `journalGCInterval`, `journalGCMaxAge`, `prefetchExternalChanges`, `role`, `versionGcMaxAgeInSecs`, `versionGCExpression`, `versionGCTimeLimitInSecs`, `blobGcMaxAgeInSecs`, `blobTrackSnapshotIntervalInSecs`, `repository.home`, `maxReplicationLagInSecs`, `documentStoreType`, `bundlingDisabled`, `updateLimit`, `persistentCacheIncludes`, `leaseCheckMode`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePro`
--
UPDATE `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePro` SET `mongouri` = ?, `db` = ?, `socketKeepAlive` = ?, `cache` = ?, `nodeCachePercentage` = ?, `prevDocCachePercentage` = ?, `childrenCachePercentage` = ?, `diffCachePercentage` = ?, `cacheSegmentCount` = ?, `cacheStackMoveDistance` = ?, `blobCacheSize` = ?, `persistentCache` = ?, `journalCache` = ?, `customBlobStore` = ?, `journalGCInterval` = ?, `journalGCMaxAge` = ?, `prefetchExternalChanges` = ?, `role` = ?, `versionGcMaxAgeInSecs` = ?, `versionGCExpression` = ?, `versionGCTimeLimitInSecs` = ?, `blobGcMaxAgeInSecs` = ?, `blobTrackSnapshotIntervalInSecs` = ?, `repository.home` = ?, `maxReplicationLagInSecs` = ?, `documentStoreType` = ?, `bundlingDisabled` = ?, `updateLimit` = ?, `persistentCacheIncludes` = ?, `leaseCheckMode` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePro`
--
DELETE FROM `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePro` WHERE 0;

