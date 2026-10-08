--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskI`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskI` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskI`
--
INSERT INTO `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskI`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskI`
--
UPDATE `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskI`
--
DELETE FROM `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskI` WHERE 0;

