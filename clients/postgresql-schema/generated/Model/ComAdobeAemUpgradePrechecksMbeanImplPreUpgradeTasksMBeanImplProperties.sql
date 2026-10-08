--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_'
--
SELECT pre_upgrade/maintenance/tasks, pre_upgrade/hc/tags FROM com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_'
--
INSERT INTO com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_ (pre_upgrade/maintenance/tasks, pre_upgrade/hc/tags) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_'
--
UPDATE com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_ SET pre_upgrade/maintenance/tasks = ?, pre_upgrade/hc/tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_'
--
DELETE FROM com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_ WHERE 1=2;

