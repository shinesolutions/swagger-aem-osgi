--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplWCMDebugFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_wcm_debug_filter_properties'
--
SELECT wcmdbgfilter/enabled, wcmdbgfilter/jsp_debug FROM com_day_cq_wcm_core_impl_wcm_debug_filter_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_wcm_debug_filter_properties'
--
INSERT INTO com_day_cq_wcm_core_impl_wcm_debug_filter_properties (wcmdbgfilter/enabled, wcmdbgfilter/jsp_debug) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_wcm_debug_filter_properties'
--
UPDATE com_day_cq_wcm_core_impl_wcm_debug_filter_properties SET wcmdbgfilter/enabled = ?, wcmdbgfilter/jsp_debug = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_wcm_debug_filter_properties'
--
DELETE FROM com_day_cq_wcm_core_impl_wcm_debug_filter_properties WHERE 1=2;

