--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskP`
--
SELECT `granite.maintenance.mandatory`, `job.topics` FROM `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskP` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskP`
--
INSERT INTO `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskP`(`granite.maintenance.mandatory`, `job.topics`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskP`
--
UPDATE `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskP` SET `granite.maintenance.mandatory` = ?, `job.topics` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskP`
--
DELETE FROM `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskP` WHERE 0;

