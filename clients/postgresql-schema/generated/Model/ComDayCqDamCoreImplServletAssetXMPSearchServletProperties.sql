--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletAssetXMPSearchServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_prope'
--
SELECT cq/dam/batch/indesign/maxassets FROM com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_prope WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_prope'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_prope (cq/dam/batch/indesign/maxassets) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_prope'
--
UPDATE com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_prope SET cq/dam/batch/indesign/maxassets = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_prope'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_prope WHERE 1=2;

