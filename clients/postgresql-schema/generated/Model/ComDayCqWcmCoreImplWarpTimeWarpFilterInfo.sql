--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplWarpTimeWarpFilterInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_warp_time_warp_filter_info'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_day_cq_wcm_core_impl_warp_time_warp_filter_info WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_warp_time_warp_filter_info'
--
INSERT INTO com_day_cq_wcm_core_impl_warp_time_warp_filter_info (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_warp_time_warp_filter_info'
--
UPDATE com_day_cq_wcm_core_impl_warp_time_warp_filter_info SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_warp_time_warp_filter_info'
--
DELETE FROM com_day_cq_wcm_core_impl_warp_time_warp_filter_info WHERE 1=2;

