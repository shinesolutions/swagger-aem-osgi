--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_bundles_hc_impl_code_cache_health_check_prope'
--
SELECT hc/tags, minimum/code/cache/size FROM com_adobe_granite_bundles_hc_impl_code_cache_health_check_prope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_bundles_hc_impl_code_cache_health_check_prope'
--
INSERT INTO com_adobe_granite_bundles_hc_impl_code_cache_health_check_prope (hc/tags, minimum/code/cache/size) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_bundles_hc_impl_code_cache_health_check_prope'
--
UPDATE com_adobe_granite_bundles_hc_impl_code_cache_health_check_prope SET hc/tags = ?, minimum/code/cache/size = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_bundles_hc_impl_code_cache_health_check_prope'
--
DELETE FROM com_adobe_granite_bundles_hc_impl_code_cache_health_check_prope WHERE 1=2;

