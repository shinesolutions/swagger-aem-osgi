--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_stock_integration_impl_cache_stock_cache_configu'
--
SELECT get_cache_expiration_unit, get_cache_expiration_value FROM com_day_cq_dam_stock_integration_impl_cache_stock_cache_configu WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_stock_integration_impl_cache_stock_cache_configu'
--
INSERT INTO com_day_cq_dam_stock_integration_impl_cache_stock_cache_configu (get_cache_expiration_unit, get_cache_expiration_value) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_stock_integration_impl_cache_stock_cache_configu'
--
UPDATE com_day_cq_dam_stock_integration_impl_cache_stock_cache_configu SET get_cache_expiration_unit = ?, get_cache_expiration_value = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_stock_integration_impl_cache_stock_cache_configu'
--
DELETE FROM com_day_cq_dam_stock_integration_impl_cache_stock_cache_configu WHERE 1=2;

