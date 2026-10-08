--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_pro'
--
SELECT upgrade_task_ignore_list FROM com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_pro WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_pro'
--
INSERT INTO com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_pro (upgrade_task_ignore_list) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_pro'
--
UPDATE com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_pro SET upgrade_task_ignore_list = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_pro'
--
DELETE FROM com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_pro WHERE 1=2;

