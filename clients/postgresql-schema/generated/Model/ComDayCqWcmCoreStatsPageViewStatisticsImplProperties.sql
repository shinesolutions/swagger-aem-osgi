--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreStatsPageViewStatisticsImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_stats_page_view_statistics_impl_properties'
--
SELECT pageviewstatistics/trackingurl, pageviewstatistics/trackingscript/enabled FROM com_day_cq_wcm_core_stats_page_view_statistics_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_stats_page_view_statistics_impl_properties'
--
INSERT INTO com_day_cq_wcm_core_stats_page_view_statistics_impl_properties (pageviewstatistics/trackingurl, pageviewstatistics/trackingscript/enabled) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_stats_page_view_statistics_impl_properties'
--
UPDATE com_day_cq_wcm_core_stats_page_view_statistics_impl_properties SET pageviewstatistics/trackingurl = ?, pageviewstatistics/trackingscript/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_stats_page_view_statistics_impl_properties'
--
DELETE FROM com_day_cq_wcm_core_stats_page_view_statistics_impl_properties WHERE 1=2;

