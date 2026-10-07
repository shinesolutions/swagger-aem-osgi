--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties' definition.
--


--
-- SELECT template for table `comDayCqDamStockIntegrationImplConfigurationStockConfigurationPr`
--
SELECT `name`, `locale`, `imsConfig` FROM `comDayCqDamStockIntegrationImplConfigurationStockConfigurationPr` WHERE 1;

--
-- INSERT template for table `comDayCqDamStockIntegrationImplConfigurationStockConfigurationPr`
--
INSERT INTO `comDayCqDamStockIntegrationImplConfigurationStockConfigurationPr`(`name`, `locale`, `imsConfig`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqDamStockIntegrationImplConfigurationStockConfigurationPr`
--
UPDATE `comDayCqDamStockIntegrationImplConfigurationStockConfigurationPr` SET `name` = ?, `locale` = ?, `imsConfig` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamStockIntegrationImplConfigurationStockConfigurationPr`
--
DELETE FROM `comDayCqDamStockIntegrationImplConfigurationStockConfigurationPr` WHERE 0;

