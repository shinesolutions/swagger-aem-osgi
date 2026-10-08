--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_proper'
--
SELECT jmx/objectname FROM com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_proper WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_proper'
--
INSERT INTO com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_proper (jmx/objectname) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_proper'
--
UPDATE com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_proper SET jmx/objectname = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_proper'
--
DELETE FROM com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_proper WHERE 1=2;

