--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeFormsCommonServletTempCleanUpTaskProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_forms_common_servlet_temp_clean_up_task_properties'
--
SELECT scheduler/expression, duration_for_temporary_storage, duration_for_anonymous_storage FROM com_adobe_forms_common_servlet_temp_clean_up_task_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_forms_common_servlet_temp_clean_up_task_properties'
--
INSERT INTO com_adobe_forms_common_servlet_temp_clean_up_task_properties (scheduler/expression, duration_for_temporary_storage, duration_for_anonymous_storage) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_forms_common_servlet_temp_clean_up_task_properties'
--
UPDATE com_adobe_forms_common_servlet_temp_clean_up_task_properties SET scheduler/expression = ?, duration_for_temporary_storage = ?, duration_for_anonymous_storage = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_forms_common_servlet_temp_clean_up_task_properties'
--
DELETE FROM com_adobe_forms_common_servlet_temp_clean_up_task_properties WHERE 1=2;

