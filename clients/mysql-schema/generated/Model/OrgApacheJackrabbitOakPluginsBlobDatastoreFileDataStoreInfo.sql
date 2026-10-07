--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo`
--
INSERT INTO `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo`
--
UPDATE `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo`
--
DELETE FROM `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo` WHERE 0;

