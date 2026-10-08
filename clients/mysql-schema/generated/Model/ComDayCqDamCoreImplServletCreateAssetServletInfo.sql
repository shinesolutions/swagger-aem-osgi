--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletCreateAssetServletInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletCreateAssetServletInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplServletCreateAssetServletInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletCreateAssetServletInfo`
--
INSERT INTO `comDayCqDamCoreImplServletCreateAssetServletInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletCreateAssetServletInfo`
--
UPDATE `comDayCqDamCoreImplServletCreateAssetServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletCreateAssetServletInfo`
--
DELETE FROM `comDayCqDamCoreImplServletCreateAssetServletInfo` WHERE 0;

