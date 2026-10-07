--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo' definition.
--


--
-- SELECT template for table `comDayCqDamStockIntegrationImplConfigurationStockConfigurationIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamStockIntegrationImplConfigurationStockConfigurationIn` WHERE 1;

--
-- INSERT template for table `comDayCqDamStockIntegrationImplConfigurationStockConfigurationIn`
--
INSERT INTO `comDayCqDamStockIntegrationImplConfigurationStockConfigurationIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamStockIntegrationImplConfigurationStockConfigurationIn`
--
UPDATE `comDayCqDamStockIntegrationImplConfigurationStockConfigurationIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamStockIntegrationImplConfigurationStockConfigurationIn`
--
DELETE FROM `comDayCqDamStockIntegrationImplConfigurationStockConfigurationIn` WHERE 0;

