--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo`
--
INSERT INTO `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo`
--
UPDATE `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo`
--
DELETE FROM `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo` WHERE 0;

