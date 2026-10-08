--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_taskmanagement_impl_purge_task_purge_maintena'
--
SELECT purge_completed, completed_age, purge_active, active_age, save_threshold FROM com_adobe_granite_taskmanagement_impl_purge_task_purge_maintena WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_taskmanagement_impl_purge_task_purge_maintena'
--
INSERT INTO com_adobe_granite_taskmanagement_impl_purge_task_purge_maintena (purge_completed, completed_age, purge_active, active_age, save_threshold) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_taskmanagement_impl_purge_task_purge_maintena'
--
UPDATE com_adobe_granite_taskmanagement_impl_purge_task_purge_maintena SET purge_completed = ?, completed_age = ?, purge_active = ?, active_age = ?, save_threshold = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_taskmanagement_impl_purge_task_purge_maintena'
--
DELETE FROM com_adobe_granite_taskmanagement_impl_purge_task_purge_maintena WHERE 1=2;

