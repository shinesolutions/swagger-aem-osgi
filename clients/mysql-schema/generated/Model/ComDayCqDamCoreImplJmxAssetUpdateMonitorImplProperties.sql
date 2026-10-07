--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties`
--
SELECT `jmx.objectname`, `active` FROM `comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties`
--
INSERT INTO `comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties`(`jmx.objectname`, `active`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties`
--
UPDATE `comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties` SET `jmx.objectname` = ?, `active` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties`
--
DELETE FROM `comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties` WHERE 0;

