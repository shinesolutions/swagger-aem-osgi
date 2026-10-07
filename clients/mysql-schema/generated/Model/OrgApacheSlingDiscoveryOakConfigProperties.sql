--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDiscoveryOakConfigProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDiscoveryOakConfigProperties`
--
SELECT `connectorPingTimeout`, `connectorPingInterval`, `discoveryLiteCheckInterval`, `clusterSyncServiceTimeout`, `clusterSyncServiceInterval`, `enableSyncToken`, `minEventDelay`, `socketConnectTimeout`, `soTimeout`, `topologyConnectorUrls`, `topologyConnectorWhitelist`, `autoStopLocalLoopEnabled`, `gzipConnectorRequestsEnabled`, `hmacEnabled`, `enableEncryption`, `sharedKey`, `hmacSharedKeyTTL`, `backoffStandbyFactor`, `backoffStableFactor` FROM `orgApacheSlingDiscoveryOakConfigProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDiscoveryOakConfigProperties`
--
INSERT INTO `orgApacheSlingDiscoveryOakConfigProperties`(`connectorPingTimeout`, `connectorPingInterval`, `discoveryLiteCheckInterval`, `clusterSyncServiceTimeout`, `clusterSyncServiceInterval`, `enableSyncToken`, `minEventDelay`, `socketConnectTimeout`, `soTimeout`, `topologyConnectorUrls`, `topologyConnectorWhitelist`, `autoStopLocalLoopEnabled`, `gzipConnectorRequestsEnabled`, `hmacEnabled`, `enableEncryption`, `sharedKey`, `hmacSharedKeyTTL`, `backoffStandbyFactor`, `backoffStableFactor`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDiscoveryOakConfigProperties`
--
UPDATE `orgApacheSlingDiscoveryOakConfigProperties` SET `connectorPingTimeout` = ?, `connectorPingInterval` = ?, `discoveryLiteCheckInterval` = ?, `clusterSyncServiceTimeout` = ?, `clusterSyncServiceInterval` = ?, `enableSyncToken` = ?, `minEventDelay` = ?, `socketConnectTimeout` = ?, `soTimeout` = ?, `topologyConnectorUrls` = ?, `topologyConnectorWhitelist` = ?, `autoStopLocalLoopEnabled` = ?, `gzipConnectorRequestsEnabled` = ?, `hmacEnabled` = ?, `enableEncryption` = ?, `sharedKey` = ?, `hmacSharedKeyTTL` = ?, `backoffStandbyFactor` = ?, `backoffStableFactor` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDiscoveryOakConfigProperties`
--
DELETE FROM `orgApacheSlingDiscoveryOakConfigProperties` WHERE 0;

