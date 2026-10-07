--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServP`
--
SELECT `disabled`, `debug`, `localIndexDir`, `enableOpenIndexAsync`, `threadPoolSize`, `prefetchIndexFiles`, `extractedTextCacheSizeInMB`, `extractedTextCacheExpiryInSecs`, `alwaysUsePreExtractedCache`, `booleanClauseLimit`, `enableHybridIndexing`, `hybridQueueSize`, `disableStoredIndexDefinition`, `deletedBlobsCollectionEnabled`, `propIndexCleanerIntervalInSecs`, `enableSingleBlobIndexFiles` FROM `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServP` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServP`
--
INSERT INTO `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServP`(`disabled`, `debug`, `localIndexDir`, `enableOpenIndexAsync`, `threadPoolSize`, `prefetchIndexFiles`, `extractedTextCacheSizeInMB`, `extractedTextCacheExpiryInSecs`, `alwaysUsePreExtractedCache`, `booleanClauseLimit`, `enableHybridIndexing`, `hybridQueueSize`, `disableStoredIndexDefinition`, `deletedBlobsCollectionEnabled`, `propIndexCleanerIntervalInSecs`, `enableSingleBlobIndexFiles`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServP`
--
UPDATE `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServP` SET `disabled` = ?, `debug` = ?, `localIndexDir` = ?, `enableOpenIndexAsync` = ?, `threadPoolSize` = ?, `prefetchIndexFiles` = ?, `extractedTextCacheSizeInMB` = ?, `extractedTextCacheExpiryInSecs` = ?, `alwaysUsePreExtractedCache` = ?, `booleanClauseLimit` = ?, `enableHybridIndexing` = ?, `hybridQueueSize` = ?, `disableStoredIndexDefinition` = ?, `deletedBlobsCollectionEnabled` = ?, `propIndexCleanerIntervalInSecs` = ?, `enableSingleBlobIndexFiles` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServP`
--
DELETE FROM `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServP` WHERE 0;

