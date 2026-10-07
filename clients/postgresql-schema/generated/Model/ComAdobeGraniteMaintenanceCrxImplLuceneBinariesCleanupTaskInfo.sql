--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_'
--
INSERT INTO com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_ (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_'
--
UPDATE com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_ SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_'
--
DELETE FROM com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_ WHERE 1=2;

