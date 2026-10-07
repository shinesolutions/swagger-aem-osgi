--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCommonsUtilImplAssetCacheImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCommonsUtilImplAssetCacheImplProperties`
--
SELECT `large.file.min`, `cache.apply`, `mime.types` FROM `comDayCqDamCommonsUtilImplAssetCacheImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCommonsUtilImplAssetCacheImplProperties`
--
INSERT INTO `comDayCqDamCommonsUtilImplAssetCacheImplProperties`(`large.file.min`, `cache.apply`, `mime.types`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCommonsUtilImplAssetCacheImplProperties`
--
UPDATE `comDayCqDamCommonsUtilImplAssetCacheImplProperties` SET `large.file.min` = ?, `cache.apply` = ?, `mime.types` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCommonsUtilImplAssetCacheImplProperties`
--
DELETE FROM `comDayCqDamCommonsUtilImplAssetCacheImplProperties` WHERE 0;

