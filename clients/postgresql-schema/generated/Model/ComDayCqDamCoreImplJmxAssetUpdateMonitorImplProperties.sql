--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properti'
--
SELECT jmx/objectname, active FROM com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properti'
--
INSERT INTO com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properti (jmx/objectname, active) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properti'
--
UPDATE com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properti SET jmx/objectname = ?, active = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properti'
--
DELETE FROM com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_properti WHERE 1=2;

