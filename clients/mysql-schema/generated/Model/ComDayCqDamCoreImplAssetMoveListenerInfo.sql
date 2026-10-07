--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplAssetMoveListenerInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplAssetMoveListenerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplAssetMoveListenerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplAssetMoveListenerInfo`
--
INSERT INTO `comDayCqDamCoreImplAssetMoveListenerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplAssetMoveListenerInfo`
--
UPDATE `comDayCqDamCoreImplAssetMoveListenerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplAssetMoveListenerInfo`
--
DELETE FROM `comDayCqDamCoreImplAssetMoveListenerInfo` WHERE 0;

