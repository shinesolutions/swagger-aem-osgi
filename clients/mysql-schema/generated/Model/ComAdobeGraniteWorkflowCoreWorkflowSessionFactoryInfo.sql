--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo`
--
INSERT INTO `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo`
--
UPDATE `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo`
--
DELETE FROM `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo` WHERE 0;

