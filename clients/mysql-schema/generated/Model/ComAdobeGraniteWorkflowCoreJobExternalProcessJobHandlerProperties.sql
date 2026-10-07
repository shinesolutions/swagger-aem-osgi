--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertie`
--
SELECT `default.timeout`, `max.timeout`, `default.period` FROM `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertie` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertie`
--
INSERT INTO `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertie`(`default.timeout`, `max.timeout`, `default.period`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertie`
--
UPDATE `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertie` SET `default.timeout` = ?, `max.timeout` = ?, `default.period` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertie`
--
DELETE FROM `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertie` WHERE 0;

