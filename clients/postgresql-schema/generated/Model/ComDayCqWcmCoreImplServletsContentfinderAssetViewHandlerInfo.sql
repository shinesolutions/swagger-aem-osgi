--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand'
--
SELECT pid, title, description, properties FROM com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand'
--
INSERT INTO com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand'
--
UPDATE com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand'
--
DELETE FROM com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand WHERE 1=2;

