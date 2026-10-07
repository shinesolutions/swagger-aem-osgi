--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo`
--
INSERT INTO `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo`
--
UPDATE `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo`
--
DELETE FROM `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo` WHERE 0;

