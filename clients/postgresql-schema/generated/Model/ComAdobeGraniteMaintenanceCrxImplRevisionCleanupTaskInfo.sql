--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_in'
--
SELECT pid, title, description, properties FROM com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_in WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_in'
--
INSERT INTO com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_in (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_in'
--
UPDATE com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_in SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_in'
--
DELETE FROM com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_in WHERE 1=2;

