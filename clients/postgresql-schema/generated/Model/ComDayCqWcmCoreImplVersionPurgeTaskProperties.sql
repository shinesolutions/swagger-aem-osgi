--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplVersionPurgeTaskProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_version_purge_task_properties'
--
SELECT versionpurge/paths, versionpurge/recursive, versionpurge/max_versions, versionpurge/min_versions, versionpurge/max_age_days FROM com_day_cq_wcm_core_impl_version_purge_task_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_version_purge_task_properties'
--
INSERT INTO com_day_cq_wcm_core_impl_version_purge_task_properties (versionpurge/paths, versionpurge/recursive, versionpurge/max_versions, versionpurge/min_versions, versionpurge/max_age_days) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_version_purge_task_properties'
--
UPDATE com_day_cq_wcm_core_impl_version_purge_task_properties SET versionpurge/paths = ?, versionpurge/recursive = ?, versionpurge/max_versions = ?, versionpurge/min_versions = ?, versionpurge/max_age_days = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_version_purge_task_properties'
--
DELETE FROM com_day_cq_wcm_core_impl_version_purge_task_properties WHERE 1=2;

