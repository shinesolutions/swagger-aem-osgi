--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties`
--
SELECT `asyncConfigs`, `leaseTimeOutMinutes`, `failingIndexTimeoutSeconds`, `errorWarnIntervalSeconds` FROM `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties`
--
INSERT INTO `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties`(`asyncConfigs`, `leaseTimeOutMinutes`, `failingIndexTimeoutSeconds`, `errorWarnIntervalSeconds`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties`
--
UPDATE `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties` SET `asyncConfigs` = ?, `leaseTimeOutMinutes` = ?, `failingIndexTimeoutSeconds` = ?, `errorWarnIntervalSeconds` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties`
--
DELETE FROM `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties` WHERE 0;

