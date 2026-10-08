--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCommonsUtilImplAssetCacheImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_commons_util_impl_asset_cache_impl_properties'
--
SELECT large/file/min, cache/apply, mime/types FROM com_day_cq_dam_commons_util_impl_asset_cache_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_commons_util_impl_asset_cache_impl_properties'
--
INSERT INTO com_day_cq_dam_commons_util_impl_asset_cache_impl_properties (large/file/min, cache/apply, mime/types) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_commons_util_impl_asset_cache_impl_properties'
--
UPDATE com_day_cq_dam_commons_util_impl_asset_cache_impl_properties SET large/file/min = ?, cache/apply = ?, mime/types = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_commons_util_impl_asset_cache_impl_properties'
--
DELETE FROM com_day_cq_dam_commons_util_impl_asset_cache_impl_properties WHERE 1=2;

