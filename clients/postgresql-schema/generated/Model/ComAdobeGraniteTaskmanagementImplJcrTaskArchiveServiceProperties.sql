--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_'
--
SELECT archiving/enabled, scheduler/expression, archive/since/days/completed FROM com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_'
--
INSERT INTO com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_ (archiving/enabled, scheduler/expression, archive/since/days/completed) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_'
--
UPDATE com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_ SET archiving/enabled = ?, scheduler/expression = ?, archive/since/days/completed = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_'
--
DELETE FROM com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_ WHERE 1=2;

