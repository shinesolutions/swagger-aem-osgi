--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteMonitoringImplScriptConfigImplInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteMonitoringImplScriptConfigImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteMonitoringImplScriptConfigImplInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteMonitoringImplScriptConfigImplInfo`
--
INSERT INTO `comAdobeGraniteMonitoringImplScriptConfigImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteMonitoringImplScriptConfigImplInfo`
--
UPDATE `comAdobeGraniteMonitoringImplScriptConfigImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteMonitoringImplScriptConfigImplInfo`
--
DELETE FROM `comAdobeGraniteMonitoringImplScriptConfigImplInfo` WHERE 0;

