--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo`
--
INSERT INTO `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo`
--
UPDATE `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo`
--
DELETE FROM `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo` WHERE 0;

