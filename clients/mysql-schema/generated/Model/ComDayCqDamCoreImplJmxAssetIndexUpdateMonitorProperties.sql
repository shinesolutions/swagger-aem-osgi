--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties`
--
SELECT `jmx.objectname`, `property.measure.enabled`, `property.name`, `property.max.wait.ms`, `property.max.rate`, `fulltext.measure.enabled`, `fulltext.name`, `fulltext.max.wait.ms`, `fulltext.max.rate` FROM `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties`
--
INSERT INTO `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties`(`jmx.objectname`, `property.measure.enabled`, `property.name`, `property.max.wait.ms`, `property.max.rate`, `fulltext.measure.enabled`, `fulltext.name`, `fulltext.max.wait.ms`, `fulltext.max.rate`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties`
--
UPDATE `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties` SET `jmx.objectname` = ?, `property.measure.enabled` = ?, `property.name` = ?, `property.max.wait.ms` = ?, `property.max.rate` = ?, `fulltext.measure.enabled` = ?, `fulltext.name` = ?, `fulltext.max.wait.ms` = ?, `fulltext.max.rate` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties`
--
DELETE FROM `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties` WHERE 0;

