--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplMissingMetadataNotificationJobProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplMissingMetadataNotificationJobProperties`
--
SELECT `cq.dam.missingmetadata.notification.scheduler.istimebased`, `cq.dam.missingmetadata.notification.scheduler.timebased.rule`, `cq.dam.missingmetadata.notification.scheduler.period.rule`, `cq.dam.missingmetadata.notification.recipient` FROM `comDayCqDamCoreImplMissingMetadataNotificationJobProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplMissingMetadataNotificationJobProperties`
--
INSERT INTO `comDayCqDamCoreImplMissingMetadataNotificationJobProperties`(`cq.dam.missingmetadata.notification.scheduler.istimebased`, `cq.dam.missingmetadata.notification.scheduler.timebased.rule`, `cq.dam.missingmetadata.notification.scheduler.period.rule`, `cq.dam.missingmetadata.notification.recipient`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplMissingMetadataNotificationJobProperties`
--
UPDATE `comDayCqDamCoreImplMissingMetadataNotificationJobProperties` SET `cq.dam.missingmetadata.notification.scheduler.istimebased` = ?, `cq.dam.missingmetadata.notification.scheduler.timebased.rule` = ?, `cq.dam.missingmetadata.notification.scheduler.period.rule` = ?, `cq.dam.missingmetadata.notification.recipient` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplMissingMetadataNotificationJobProperties`
--
DELETE FROM `comDayCqDamCoreImplMissingMetadataNotificationJobProperties` WHERE 0;

