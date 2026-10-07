--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeCqProjectsPurgeSchedulerProperties' definition.
--


--
-- SELECT template for table `comAdobeCqProjectsPurgeSchedulerProperties`
--
SELECT `scheduledpurge.name`, `scheduledpurge.purgeActive`, `scheduledpurge.templates`, `scheduledpurge.purgeGroups`, `scheduledpurge.purgeAssets`, `scheduledpurge.terminateRunningWorkflows`, `scheduledpurge.daysold`, `scheduledpurge.saveThreshold` FROM `comAdobeCqProjectsPurgeSchedulerProperties` WHERE 1;

--
-- INSERT template for table `comAdobeCqProjectsPurgeSchedulerProperties`
--
INSERT INTO `comAdobeCqProjectsPurgeSchedulerProperties`(`scheduledpurge.name`, `scheduledpurge.purgeActive`, `scheduledpurge.templates`, `scheduledpurge.purgeGroups`, `scheduledpurge.purgeAssets`, `scheduledpurge.terminateRunningWorkflows`, `scheduledpurge.daysold`, `scheduledpurge.saveThreshold`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeCqProjectsPurgeSchedulerProperties`
--
UPDATE `comAdobeCqProjectsPurgeSchedulerProperties` SET `scheduledpurge.name` = ?, `scheduledpurge.purgeActive` = ?, `scheduledpurge.templates` = ?, `scheduledpurge.purgeGroups` = ?, `scheduledpurge.purgeAssets` = ?, `scheduledpurge.terminateRunningWorkflows` = ?, `scheduledpurge.daysold` = ?, `scheduledpurge.saveThreshold` = ? WHERE 1;

--
-- DELETE template for table `comAdobeCqProjectsPurgeSchedulerProperties`
--
DELETE FROM `comAdobeCqProjectsPurgeSchedulerProperties` WHERE 0;

