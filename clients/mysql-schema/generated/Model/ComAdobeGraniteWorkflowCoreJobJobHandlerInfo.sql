--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreJobJobHandlerInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreJobJobHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteWorkflowCoreJobJobHandlerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreJobJobHandlerInfo`
--
INSERT INTO `comAdobeGraniteWorkflowCoreJobJobHandlerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreJobJobHandlerInfo`
--
UPDATE `comAdobeGraniteWorkflowCoreJobJobHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreJobJobHandlerInfo`
--
DELETE FROM `comAdobeGraniteWorkflowCoreJobJobHandlerInfo` WHERE 0;

