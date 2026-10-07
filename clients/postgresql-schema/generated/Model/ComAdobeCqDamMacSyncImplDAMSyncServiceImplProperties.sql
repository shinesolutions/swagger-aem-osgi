--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties'
--
SELECT com/adobe/cq/dam/mac/sync/damsyncservice/registered_paths, com/adobe/cq/dam/mac/sync/damsyncservice/sync/renditions, com/adobe/cq/dam/mac/sync/damsyncservice/replicate/thread/wait/, com/adobe/cq/dam/mac/sync/damsyncservice/platform FROM com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties'
--
INSERT INTO com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties (com/adobe/cq/dam/mac/sync/damsyncservice/registered_paths, com/adobe/cq/dam/mac/sync/damsyncservice/sync/renditions, com/adobe/cq/dam/mac/sync/damsyncservice/replicate/thread/wait/, com/adobe/cq/dam/mac/sync/damsyncservice/platform) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties'
--
UPDATE com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties SET com/adobe/cq/dam/mac/sync/damsyncservice/registered_paths = ?, com/adobe/cq/dam/mac/sync/damsyncservice/sync/renditions = ?, com/adobe/cq/dam/mac/sync/damsyncservice/replicate/thread/wait/ = ?, com/adobe/cq/dam/mac/sync/damsyncservice/platform = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties'
--
DELETE FROM com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties WHERE 1=2;

