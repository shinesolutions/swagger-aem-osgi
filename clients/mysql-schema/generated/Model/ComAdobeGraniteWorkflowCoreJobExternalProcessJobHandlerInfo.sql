--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo`
--
INSERT INTO `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo`
--
UPDATE `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo`
--
DELETE FROM `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo` WHERE 0;

