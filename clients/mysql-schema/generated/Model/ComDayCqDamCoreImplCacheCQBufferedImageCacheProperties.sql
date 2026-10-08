--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplCacheCQBufferedImageCacheProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplCacheCQBufferedImageCacheProperties`
--
SELECT `cq.dam.image.cache.max.memory`, `cq.dam.image.cache.max.age`, `cq.dam.image.cache.max.dimension` FROM `comDayCqDamCoreImplCacheCQBufferedImageCacheProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplCacheCQBufferedImageCacheProperties`
--
INSERT INTO `comDayCqDamCoreImplCacheCQBufferedImageCacheProperties`(`cq.dam.image.cache.max.memory`, `cq.dam.image.cache.max.age`, `cq.dam.image.cache.max.dimension`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplCacheCQBufferedImageCacheProperties`
--
UPDATE `comDayCqDamCoreImplCacheCQBufferedImageCacheProperties` SET `cq.dam.image.cache.max.memory` = ?, `cq.dam.image.cache.max.age` = ?, `cq.dam.image.cache.max.dimension` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplCacheCQBufferedImageCacheProperties`
--
DELETE FROM `comDayCqDamCoreImplCacheCQBufferedImageCacheProperties` WHERE 0;

