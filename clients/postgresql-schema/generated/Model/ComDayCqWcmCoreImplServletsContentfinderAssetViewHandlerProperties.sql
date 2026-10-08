--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand'
--
SELECT dam/showexpired, dam/showhidden, tag_title_search, guess_total, dam/expiry_property FROM com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand'
--
INSERT INTO com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand (dam/showexpired, dam/showhidden, tag_title_search, guess_total, dam/expiry_property) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand'
--
UPDATE com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand SET dam/showexpired = ?, dam/showhidden = ?, tag_title_search = ?, guess_total = ?, dam/expiry_property = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand'
--
DELETE FROM com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_hand WHERE 1=2;

