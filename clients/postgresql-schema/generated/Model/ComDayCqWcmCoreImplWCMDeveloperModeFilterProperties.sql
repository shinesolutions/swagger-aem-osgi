--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplWCMDeveloperModeFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties'
--
SELECT wcmdevmodefilter/enabled FROM com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties'
--
INSERT INTO com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties (wcmdevmodefilter/enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties'
--
UPDATE com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties SET wcmdevmodefilter/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties'
--
DELETE FROM com_day_cq_wcm_core_impl_wcm_developer_mode_filter_properties WHERE 1=2;

