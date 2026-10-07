--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPr`
--
SELECT `purgeCompleted`, `completedAge`, `purgeActive`, `activeAge`, `saveThreshold` FROM `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPr` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPr`
--
INSERT INTO `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPr`(`purgeCompleted`, `completedAge`, `purgeActive`, `activeAge`, `saveThreshold`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPr`
--
UPDATE `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPr` SET `purgeCompleted` = ?, `completedAge` = ?, `purgeActive` = ?, `activeAge` = ?, `saveThreshold` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPr`
--
DELETE FROM `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPr` WHERE 0;

