--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_stock_integration_impl_configuration_stock_confi'
--
SELECT "name", locale, ims_config FROM com_day_cq_dam_stock_integration_impl_configuration_stock_confi WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_stock_integration_impl_configuration_stock_confi'
--
INSERT INTO com_day_cq_dam_stock_integration_impl_configuration_stock_confi ("name", locale, ims_config) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_stock_integration_impl_configuration_stock_confi'
--
UPDATE com_day_cq_dam_stock_integration_impl_configuration_stock_confi SET "name" = ?, locale = ?, ims_config = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_stock_integration_impl_configuration_stock_confi'
--
DELETE FROM com_day_cq_dam_stock_integration_impl_configuration_stock_confi WHERE 1=2;

