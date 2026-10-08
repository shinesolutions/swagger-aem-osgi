--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_performance_internal_asset_performance_report_sy'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_performance_internal_asset_performance_report_sy WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_performance_internal_asset_performance_report_sy'
--
INSERT INTO com_day_cq_dam_performance_internal_asset_performance_report_sy (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_performance_internal_asset_performance_report_sy'
--
UPDATE com_day_cq_dam_performance_internal_asset_performance_report_sy SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_performance_internal_asset_performance_report_sy'
--
DELETE FROM com_day_cq_dam_performance_internal_asset_performance_report_sy WHERE 1=2;

