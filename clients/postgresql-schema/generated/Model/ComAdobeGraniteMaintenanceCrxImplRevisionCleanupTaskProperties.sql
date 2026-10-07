--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_pr'
--
SELECT full/gc/days FROM com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_pr'
--
INSERT INTO com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_pr (full/gc/days) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_pr'
--
UPDATE com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_pr SET full/gc/days = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_pr'
--
DELETE FROM com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_pr WHERE 1=2;

