--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle'
--
SELECT granite/maintenance/mandatory, job/topics FROM com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle'
--
INSERT INTO com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle (granite/maintenance/mandatory, job/topics) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle'
--
UPDATE com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle SET granite/maintenance/mandatory = ?, job/topics = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle'
--
DELETE FROM com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle WHERE 1=2;

