--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplWarpTimeWarpFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_warp_time_warp_filter_properties'
--
SELECT filter/order, filter/scope FROM com_day_cq_wcm_core_impl_warp_time_warp_filter_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_warp_time_warp_filter_properties'
--
INSERT INTO com_day_cq_wcm_core_impl_warp_time_warp_filter_properties (filter/order, filter/scope) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_warp_time_warp_filter_properties'
--
UPDATE com_day_cq_wcm_core_impl_warp_time_warp_filter_properties SET filter/order = ?, filter/scope = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_warp_time_warp_filter_properties'
--
DELETE FROM com_day_cq_wcm_core_impl_warp_time_warp_filter_properties WHERE 1=2;

