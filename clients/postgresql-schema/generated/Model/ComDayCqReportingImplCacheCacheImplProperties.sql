--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReportingImplCacheCacheImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_reporting_impl_cache_cache_impl_properties'
--
SELECT repcache/enable, repcache/ttl, repcache/max FROM com_day_cq_reporting_impl_cache_cache_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_reporting_impl_cache_cache_impl_properties'
--
INSERT INTO com_day_cq_reporting_impl_cache_cache_impl_properties (repcache/enable, repcache/ttl, repcache/max) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_reporting_impl_cache_cache_impl_properties'
--
UPDATE com_day_cq_reporting_impl_cache_cache_impl_properties SET repcache/enable = ?, repcache/ttl = ?, repcache/max = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_reporting_impl_cache_cache_impl_properties'
--
DELETE FROM com_day_cq_reporting_impl_cache_cache_impl_properties WHERE 1=2;

