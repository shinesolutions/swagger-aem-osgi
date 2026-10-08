--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplMissingMetadataNotificationJobInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplMissingMetadataNotificationJobInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplMissingMetadataNotificationJobInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplMissingMetadataNotificationJobInfo`
--
INSERT INTO `comDayCqDamCoreImplMissingMetadataNotificationJobInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplMissingMetadataNotificationJobInfo`
--
UPDATE `comDayCqDamCoreImplMissingMetadataNotificationJobInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplMissingMetadataNotificationJobInfo`
--
DELETE FROM `comDayCqDamCoreImplMissingMetadataNotificationJobInfo` WHERE 0;

