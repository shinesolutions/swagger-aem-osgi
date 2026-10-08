--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerIn`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerIn` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerIn`
--
INSERT INTO `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerIn`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerIn`
--
UPDATE `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerIn`
--
DELETE FROM `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerIn` WHERE 0;

