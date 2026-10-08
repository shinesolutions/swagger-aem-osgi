--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties`
--
SELECT `queryLimitInMemory`, `queryLimitReads`, `queryFailTraversal`, `fastQuerySize` FROM `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties`
--
INSERT INTO `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties`(`queryLimitInMemory`, `queryLimitReads`, `queryFailTraversal`, `fastQuerySize`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties`
--
UPDATE `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties` SET `queryLimitInMemory` = ?, `queryLimitReads` = ?, `queryFailTraversal` = ?, `fastQuerySize` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties`
--
DELETE FROM `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties` WHERE 0;

