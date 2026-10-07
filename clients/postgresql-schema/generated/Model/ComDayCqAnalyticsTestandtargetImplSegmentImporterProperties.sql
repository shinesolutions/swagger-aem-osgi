--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsTestandtargetImplSegmentImporterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_testandtarget_impl_segment_importer_proper'
--
SELECT cq/analytics/testandtarget/segmentimporter/enabled FROM com_day_cq_analytics_testandtarget_impl_segment_importer_proper WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_testandtarget_impl_segment_importer_proper'
--
INSERT INTO com_day_cq_analytics_testandtarget_impl_segment_importer_proper (cq/analytics/testandtarget/segmentimporter/enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_analytics_testandtarget_impl_segment_importer_proper'
--
UPDATE com_day_cq_analytics_testandtarget_impl_segment_importer_proper SET cq/analytics/testandtarget/segmentimporter/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_testandtarget_impl_segment_importer_proper'
--
DELETE FROM com_day_cq_analytics_testandtarget_impl_segment_importer_proper WHERE 1=2;

