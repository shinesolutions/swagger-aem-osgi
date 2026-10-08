--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplCommandsWCMCommandServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_commands_wcm_command_servlet_propertie'
--
SELECT wcmcommandservlet/delete_whitelist FROM com_day_cq_wcm_core_impl_commands_wcm_command_servlet_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_commands_wcm_command_servlet_propertie'
--
INSERT INTO com_day_cq_wcm_core_impl_commands_wcm_command_servlet_propertie (wcmcommandservlet/delete_whitelist) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_commands_wcm_command_servlet_propertie'
--
UPDATE com_day_cq_wcm_core_impl_commands_wcm_command_servlet_propertie SET wcmcommandservlet/delete_whitelist = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_commands_wcm_command_servlet_propertie'
--
DELETE FROM com_day_cq_wcm_core_impl_commands_wcm_command_servlet_propertie WHERE 1=2;

