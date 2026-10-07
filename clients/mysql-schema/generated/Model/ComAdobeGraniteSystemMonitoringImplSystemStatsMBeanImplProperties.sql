--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertie`
--
SELECT `scheduler.expression`, `jmx.objectname` FROM `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertie` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertie`
--
INSERT INTO `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertie`(`scheduler.expression`, `jmx.objectname`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertie`
--
UPDATE `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertie` SET `scheduler.expression` = ?, `jmx.objectname` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertie`
--
DELETE FROM `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertie` WHERE 0;

