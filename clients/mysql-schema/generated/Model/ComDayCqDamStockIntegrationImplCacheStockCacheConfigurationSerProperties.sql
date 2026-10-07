--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties' definition.
--


--
-- SELECT template for table `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPr`
--
SELECT `getCacheExpirationUnit`, `getCacheExpirationValue` FROM `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPr` WHERE 1;

--
-- INSERT template for table `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPr`
--
INSERT INTO `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPr`(`getCacheExpirationUnit`, `getCacheExpirationValue`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPr`
--
UPDATE `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPr` SET `getCacheExpirationUnit` = ?, `getCacheExpirationValue` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPr`
--
DELETE FROM `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPr` WHERE 0;

