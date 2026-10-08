--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo`
--
INSERT INTO `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo`
--
UPDATE `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo`
--
DELETE FROM `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo` WHERE 0;

