--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplDamEventRecorderImplInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplDamEventRecorderImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplDamEventRecorderImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplDamEventRecorderImplInfo`
--
INSERT INTO `comDayCqDamCoreImplDamEventRecorderImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplDamEventRecorderImplInfo`
--
UPDATE `comDayCqDamCoreImplDamEventRecorderImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplDamEventRecorderImplInfo`
--
DELETE FROM `comDayCqDamCoreImplDamEventRecorderImplInfo` WHERE 0;

