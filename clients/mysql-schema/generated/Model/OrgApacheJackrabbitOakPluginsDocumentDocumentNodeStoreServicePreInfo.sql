--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo' definition.
--


--
-- SELECT template for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre` WHERE 1;

--
-- INSERT template for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre`
--
INSERT INTO `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre`
--
UPDATE `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre`
--
DELETE FROM `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre` WHERE 0;

