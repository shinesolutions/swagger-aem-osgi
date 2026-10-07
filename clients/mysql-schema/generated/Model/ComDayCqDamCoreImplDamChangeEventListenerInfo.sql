--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplDamChangeEventListenerInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplDamChangeEventListenerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplDamChangeEventListenerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplDamChangeEventListenerInfo`
--
INSERT INTO `comDayCqDamCoreImplDamChangeEventListenerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplDamChangeEventListenerInfo`
--
UPDATE `comDayCqDamCoreImplDamChangeEventListenerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplDamChangeEventListenerInfo`
--
DELETE FROM `comDayCqDamCoreImplDamChangeEventListenerInfo` WHERE 0;

