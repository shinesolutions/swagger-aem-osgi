--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProp`
--
SELECT `cq.dam.adhoc.asset.share.prezip.maxcontentsize` FROM `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProp` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProp`
--
INSERT INTO `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProp`(`cq.dam.adhoc.asset.share.prezip.maxcontentsize`) VALUES (?);

--
-- UPDATE template for table `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProp`
--
UPDATE `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProp` SET `cq.dam.adhoc.asset.share.prezip.maxcontentsize` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProp`
--
DELETE FROM `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProp` WHERE 0;

