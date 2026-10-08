--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo`
--
INSERT INTO `comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo`
--
UPDATE `comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo`
--
DELETE FROM `comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo` WHERE 0;

