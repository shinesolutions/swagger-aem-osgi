--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle'
--
INSERT INTO com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle'
--
UPDATE com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle'
--
DELETE FROM com_adobe_granite_maintenance_crx_impl_data_store_garbage_colle WHERE 1=2;

