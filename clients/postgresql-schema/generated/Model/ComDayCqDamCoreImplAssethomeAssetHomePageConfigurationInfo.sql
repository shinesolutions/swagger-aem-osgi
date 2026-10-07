--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio'
--
SELECT pid, title, description, properties FROM com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio'
--
INSERT INTO com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio'
--
UPDATE com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio'
--
DELETE FROM com_day_cq_dam_core_impl_assethome_asset_home_page_configuratio WHERE 1=2;

