--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWidgetImplWidgetExtensionProviderImplInfo' definition.
--


--
-- SELECT template for table `comDayCqWidgetImplWidgetExtensionProviderImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWidgetImplWidgetExtensionProviderImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWidgetImplWidgetExtensionProviderImplInfo`
--
INSERT INTO `comDayCqWidgetImplWidgetExtensionProviderImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWidgetImplWidgetExtensionProviderImplInfo`
--
UPDATE `comDayCqWidgetImplWidgetExtensionProviderImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWidgetImplWidgetExtensionProviderImplInfo`
--
DELETE FROM `comDayCqWidgetImplWidgetExtensionProviderImplInfo` WHERE 0;

