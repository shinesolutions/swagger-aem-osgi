--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowPurgeSchedulerInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowPurgeSchedulerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteWorkflowPurgeSchedulerInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowPurgeSchedulerInfo`
--
INSERT INTO `comAdobeGraniteWorkflowPurgeSchedulerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowPurgeSchedulerInfo`
--
UPDATE `comAdobeGraniteWorkflowPurgeSchedulerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowPurgeSchedulerInfo`
--
DELETE FROM `comAdobeGraniteWorkflowPurgeSchedulerInfo` WHERE 0;

