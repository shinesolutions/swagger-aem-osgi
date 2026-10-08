--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCrxSecurityTokenImplTokenCleanupTaskProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_crx_security_token_impl_token_cleanup_task_properties'
--
SELECT enable/token/cleanup/task, scheduler/expression, batch/size FROM com_day_crx_security_token_impl_token_cleanup_task_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_crx_security_token_impl_token_cleanup_task_properties'
--
INSERT INTO com_day_crx_security_token_impl_token_cleanup_task_properties (enable/token/cleanup/task, scheduler/expression, batch/size) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_crx_security_token_impl_token_cleanup_task_properties'
--
UPDATE com_day_crx_security_token_impl_token_cleanup_task_properties SET enable/token/cleanup/task = ?, scheduler/expression = ?, batch/size = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_crx_security_token_impl_token_cleanup_task_properties'
--
DELETE FROM com_day_crx_security_token_impl_token_cleanup_task_properties WHERE 1=2;

