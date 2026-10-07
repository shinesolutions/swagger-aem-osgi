--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplDamEventPurgeServiceInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplDamEventPurgeServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplDamEventPurgeServiceInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplDamEventPurgeServiceInfo`
--
INSERT INTO `comDayCqDamCoreImplDamEventPurgeServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplDamEventPurgeServiceInfo`
--
UPDATE `comDayCqDamCoreImplDamEventPurgeServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplDamEventPurgeServiceInfo`
--
DELETE FROM `comDayCqDamCoreImplDamEventPurgeServiceInfo` WHERE 0;

