--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_ta'
--
SELECT pid, title, description, properties FROM com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_ta WHERE 1=1;

--
-- INSERT template for table 'com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_ta'
--
INSERT INTO com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_ta (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_ta'
--
UPDATE com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_ta SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_ta'
--
DELETE FROM com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_ta WHERE 1=2;

