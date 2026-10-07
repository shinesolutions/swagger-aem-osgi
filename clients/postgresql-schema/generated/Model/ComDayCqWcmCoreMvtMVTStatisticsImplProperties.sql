--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreMvtMVTStatisticsImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties'
--
SELECT mvtstatistics/trackingurl FROM com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties'
--
INSERT INTO com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties (mvtstatistics/trackingurl) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties'
--
UPDATE com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties SET mvtstatistics/trackingurl = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties'
--
DELETE FROM com_day_cq_wcm_core_mvt_mvt_statistics_impl_properties WHERE 1=2;

