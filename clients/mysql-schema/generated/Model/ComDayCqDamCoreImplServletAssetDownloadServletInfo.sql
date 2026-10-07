--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletAssetDownloadServletInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletAssetDownloadServletInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqDamCoreImplServletAssetDownloadServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletAssetDownloadServletInfo`
--
INSERT INTO `comDayCqDamCoreImplServletAssetDownloadServletInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletAssetDownloadServletInfo`
--
UPDATE `comDayCqDamCoreImplServletAssetDownloadServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletAssetDownloadServletInfo`
--
DELETE FROM `comDayCqDamCoreImplServletAssetDownloadServletInfo` WHERE 0;

