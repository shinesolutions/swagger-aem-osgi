--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskIn` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskIn`
--
INSERT INTO `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskIn`
--
UPDATE `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskIn`
--
DELETE FROM `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskIn` WHERE 0;

