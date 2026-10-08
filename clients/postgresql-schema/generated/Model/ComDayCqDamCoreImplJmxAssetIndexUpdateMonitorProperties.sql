--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propert'
--
SELECT jmx/objectname, property/measure/enabled, property/name, property/max/wait/ms, property/max/rate, fulltext/measure/enabled, fulltext/name, fulltext/max/wait/ms, fulltext/max/rate FROM com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propert WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propert'
--
INSERT INTO com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propert (jmx/objectname, property/measure/enabled, property/name, property/max/wait/ms, property/max/rate, fulltext/measure/enabled, fulltext/name, fulltext/max/wait/ms, fulltext/max/rate) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propert'
--
UPDATE com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propert SET jmx/objectname = ?, property/measure/enabled = ?, property/name = ?, property/max/wait/ms = ?, property/max/rate = ?, fulltext/measure/enabled = ?, fulltext/name = ?, fulltext/max/wait/ms = ?, fulltext/max/rate = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propert'
--
DELETE FROM com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_propert WHERE 1=2;

