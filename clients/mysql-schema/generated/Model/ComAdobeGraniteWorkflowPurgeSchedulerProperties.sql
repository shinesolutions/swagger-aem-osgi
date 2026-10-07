--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteWorkflowPurgeSchedulerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteWorkflowPurgeSchedulerProperties`
--
SELECT `scheduledpurge.name`, `scheduledpurge.workflowStatus`, `scheduledpurge.modelIds`, `scheduledpurge.daysold` FROM `comAdobeGraniteWorkflowPurgeSchedulerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteWorkflowPurgeSchedulerProperties`
--
INSERT INTO `comAdobeGraniteWorkflowPurgeSchedulerProperties`(`scheduledpurge.name`, `scheduledpurge.workflowStatus`, `scheduledpurge.modelIds`, `scheduledpurge.daysold`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteWorkflowPurgeSchedulerProperties`
--
UPDATE `comAdobeGraniteWorkflowPurgeSchedulerProperties` SET `scheduledpurge.name` = ?, `scheduledpurge.workflowStatus` = ?, `scheduledpurge.modelIds` = ?, `scheduledpurge.daysold` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteWorkflowPurgeSchedulerProperties`
--
DELETE FROM `comAdobeGraniteWorkflowPurgeSchedulerProperties` WHERE 0;

