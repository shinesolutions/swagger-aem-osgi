--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo`
--
INSERT INTO `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo`
--
UPDATE `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo`
--
DELETE FROM `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo` WHERE 0;

