--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_performance_internal_asset_performance_data_hand'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_performance_internal_asset_performance_data_hand WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_performance_internal_asset_performance_data_hand'
--
INSERT INTO com_day_cq_dam_performance_internal_asset_performance_data_hand (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_performance_internal_asset_performance_data_hand'
--
UPDATE com_day_cq_dam_performance_internal_asset_performance_data_hand SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_performance_internal_asset_performance_data_hand'
--
DELETE FROM com_day_cq_dam_performance_internal_asset_performance_data_hand WHERE 1=2;

