--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplDamEventPurgeServiceProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplDamEventPurgeServiceProperties`
--
SELECT `scheduler.expression`, `maxSavedActivities`, `saveInterval`, `enableActivityPurge`, `eventTypes` FROM `comDayCqDamCoreImplDamEventPurgeServiceProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplDamEventPurgeServiceProperties`
--
INSERT INTO `comDayCqDamCoreImplDamEventPurgeServiceProperties`(`scheduler.expression`, `maxSavedActivities`, `saveInterval`, `enableActivityPurge`, `eventTypes`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplDamEventPurgeServiceProperties`
--
UPDATE `comDayCqDamCoreImplDamEventPurgeServiceProperties` SET `scheduler.expression` = ?, `maxSavedActivities` = ?, `saveInterval` = ?, `enableActivityPurge` = ?, `eventTypes` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplDamEventPurgeServiceProperties`
--
DELETE FROM `comDayCqDamCoreImplDamEventPurgeServiceProperties` WHERE 0;

