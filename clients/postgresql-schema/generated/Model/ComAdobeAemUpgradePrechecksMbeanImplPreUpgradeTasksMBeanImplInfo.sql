--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_'
--
INSERT INTO com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_ (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_'
--
UPDATE com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_ SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_'
--
DELETE FROM com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_ WHERE 1=2;

