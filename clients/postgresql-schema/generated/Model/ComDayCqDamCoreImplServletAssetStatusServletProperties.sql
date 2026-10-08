--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplServletAssetStatusServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_servlet_asset_status_servlet_propertie'
--
SELECT cq/dam/batch/status/maxassets FROM com_day_cq_dam_core_impl_servlet_asset_status_servlet_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_servlet_asset_status_servlet_propertie'
--
INSERT INTO com_day_cq_dam_core_impl_servlet_asset_status_servlet_propertie (cq/dam/batch/status/maxassets) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_servlet_asset_status_servlet_propertie'
--
UPDATE com_day_cq_dam_core_impl_servlet_asset_status_servlet_propertie SET cq/dam/batch/status/maxassets = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_servlet_asset_status_servlet_propertie'
--
DELETE FROM com_day_cq_dam_core_impl_servlet_asset_status_servlet_propertie WHERE 1=2;

