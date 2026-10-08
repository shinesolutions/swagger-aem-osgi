--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio'
--
SELECT is_enabled FROM com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio'
--
INSERT INTO com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio (is_enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio'
--
UPDATE com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio SET is_enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio'
--
DELETE FROM com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio WHERE 1=2;

