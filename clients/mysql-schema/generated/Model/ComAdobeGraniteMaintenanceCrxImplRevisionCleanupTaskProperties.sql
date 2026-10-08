--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties`
--
SELECT `full.gc.days` FROM `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties`
--
INSERT INTO `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties`(`full.gc.days`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties`
--
UPDATE `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties` SET `full.gc.days` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties`
--
DELETE FROM `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties` WHERE 0;

