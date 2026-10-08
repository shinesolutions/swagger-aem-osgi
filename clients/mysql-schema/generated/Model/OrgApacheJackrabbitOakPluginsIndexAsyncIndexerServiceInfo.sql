--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo`
--
INSERT INTO `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo`
--
UPDATE `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo`
--
DELETE FROM `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo` WHERE 0;

