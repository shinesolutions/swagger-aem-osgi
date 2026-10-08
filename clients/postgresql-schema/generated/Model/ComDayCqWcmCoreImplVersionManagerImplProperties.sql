--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplVersionManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_version_manager_impl_properties'
--
SELECT versionmanager/create_version_on_activation, versionmanager/purging_enabled, versionmanager/purge_paths, versionmanager/iv_paths, versionmanager/max_age_days, versionmanager/max_number_versions, versionmanager/min_number_versions FROM com_day_cq_wcm_core_impl_version_manager_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_version_manager_impl_properties'
--
INSERT INTO com_day_cq_wcm_core_impl_version_manager_impl_properties (versionmanager/create_version_on_activation, versionmanager/purging_enabled, versionmanager/purge_paths, versionmanager/iv_paths, versionmanager/max_age_days, versionmanager/max_number_versions, versionmanager/min_number_versions) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_version_manager_impl_properties'
--
UPDATE com_day_cq_wcm_core_impl_version_manager_impl_properties SET versionmanager/create_version_on_activation = ?, versionmanager/purging_enabled = ?, versionmanager/purge_paths = ?, versionmanager/iv_paths = ?, versionmanager/max_age_days = ?, versionmanager/max_number_versions = ?, versionmanager/min_number_versions = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_version_manager_impl_properties'
--
DELETE FROM com_day_cq_wcm_core_impl_version_manager_impl_properties WHERE 1=2;

