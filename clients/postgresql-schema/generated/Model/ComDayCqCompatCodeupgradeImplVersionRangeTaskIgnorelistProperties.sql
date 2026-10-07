--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelis'
--
SELECT effective_bundle_list_path FROM com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelis WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelis'
--
INSERT INTO com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelis (effective_bundle_list_path) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelis'
--
UPDATE com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelis SET effective_bundle_list_path = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelis'
--
DELETE FROM com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelis WHERE 1=2;

