--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplDamEventRecorderImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplDamEventRecorderImplProperties`
--
SELECT `event.filter`, `event.queue.length`, `eventrecorder.enabled`, `eventrecorder.blacklist`, `eventrecorder.eventtypes` FROM `comDayCqDamCoreImplDamEventRecorderImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplDamEventRecorderImplProperties`
--
INSERT INTO `comDayCqDamCoreImplDamEventRecorderImplProperties`(`event.filter`, `event.queue.length`, `eventrecorder.enabled`, `eventrecorder.blacklist`, `eventrecorder.eventtypes`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplDamEventRecorderImplProperties`
--
UPDATE `comDayCqDamCoreImplDamEventRecorderImplProperties` SET `event.filter` = ?, `event.queue.length` = ?, `eventrecorder.enabled` = ?, `eventrecorder.blacklist` = ?, `eventrecorder.eventtypes` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplDamEventRecorderImplProperties`
--
DELETE FROM `comDayCqDamCoreImplDamEventRecorderImplProperties` WHERE 0;

