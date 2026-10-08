--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplCacheCQBufferedImageCacheProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properti'
--
SELECT cq/dam/image/cache/max/memory, cq/dam/image/cache/max/age, cq/dam/image/cache/max/dimension FROM com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properti'
--
INSERT INTO com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properti (cq/dam/image/cache/max/memory, cq/dam/image/cache/max/age, cq/dam/image/cache/max/dimension) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properti'
--
UPDATE com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properti SET cq/dam/image/cache/max/memory = ?, cq/dam/image/cache/max/age = ?, cq/dam/image/cache/max/dimension = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properti'
--
DELETE FROM com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_properti WHERE 1=2;

