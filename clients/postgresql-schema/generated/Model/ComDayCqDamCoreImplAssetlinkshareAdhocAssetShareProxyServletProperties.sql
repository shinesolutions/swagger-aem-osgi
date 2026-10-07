--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy'
--
SELECT cq/dam/adhoc/asset/share/prezip/maxcontentsize FROM com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy'
--
INSERT INTO com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy (cq/dam/adhoc/asset/share/prezip/maxcontentsize) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy'
--
UPDATE com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy SET cq/dam/adhoc/asset/share/prezip/maxcontentsize = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy'
--
DELETE FROM com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy WHERE 1=2;

