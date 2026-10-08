--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplLanguageManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_language_manager_impl_properties'
--
SELECT langmgr/list/path, langmgr/country/default FROM com_day_cq_wcm_core_impl_language_manager_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_language_manager_impl_properties'
--
INSERT INTO com_day_cq_wcm_core_impl_language_manager_impl_properties (langmgr/list/path, langmgr/country/default) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_language_manager_impl_properties'
--
UPDATE com_day_cq_wcm_core_impl_language_manager_impl_properties SET langmgr/list/path = ?, langmgr/country/default = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_language_manager_impl_properties'
--
DELETE FROM com_day_cq_wcm_core_impl_language_manager_impl_properties WHERE 1=2;

