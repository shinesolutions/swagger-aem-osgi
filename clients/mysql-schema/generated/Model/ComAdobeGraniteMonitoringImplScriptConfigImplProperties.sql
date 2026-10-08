--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteMonitoringImplScriptConfigImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteMonitoringImplScriptConfigImplProperties`
--
SELECT `script.filename`, `script.display`, `script.path`, `script.platform`, `interval`, `jmxdomain` FROM `comAdobeGraniteMonitoringImplScriptConfigImplProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteMonitoringImplScriptConfigImplProperties`
--
INSERT INTO `comAdobeGraniteMonitoringImplScriptConfigImplProperties`(`script.filename`, `script.display`, `script.path`, `script.platform`, `interval`, `jmxdomain`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteMonitoringImplScriptConfigImplProperties`
--
UPDATE `comAdobeGraniteMonitoringImplScriptConfigImplProperties` SET `script.filename` = ?, `script.display` = ?, `script.path` = ?, `script.platform` = ?, `interval` = ?, `jmxdomain` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteMonitoringImplScriptConfigImplProperties`
--
DELETE FROM `comAdobeGraniteMonitoringImplScriptConfigImplProperties` WHERE 0;

