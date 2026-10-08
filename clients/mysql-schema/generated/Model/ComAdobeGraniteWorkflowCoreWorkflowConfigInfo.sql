--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreWorkflowConfigInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreWorkflowConfigInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteWorkflowCoreWorkflowConfigInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreWorkflowConfigInfo`
--
INSERT INTO `comAdobeGraniteWorkflowCoreWorkflowConfigInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreWorkflowConfigInfo`
--
UPDATE `comAdobeGraniteWorkflowCoreWorkflowConfigInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreWorkflowConfigInfo`
--
DELETE FROM `comAdobeGraniteWorkflowCoreWorkflowConfigInfo` WHERE 0;

