--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWidgetImplHtmlLibraryManagerImplInfo' definition.
--


--
-- SELECT template for table `comDayCqWidgetImplHtmlLibraryManagerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWidgetImplHtmlLibraryManagerImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWidgetImplHtmlLibraryManagerImplInfo`
--
INSERT INTO `comDayCqWidgetImplHtmlLibraryManagerImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWidgetImplHtmlLibraryManagerImplInfo`
--
UPDATE `comDayCqWidgetImplHtmlLibraryManagerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWidgetImplHtmlLibraryManagerImplInfo`
--
DELETE FROM `comDayCqWidgetImplHtmlLibraryManagerImplInfo` WHERE 0;

