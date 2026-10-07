--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplDamChangeEventListenerProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplDamChangeEventListenerProperties`
--
SELECT `changeeventlistener.observed.paths` FROM `comDayCqDamCoreImplDamChangeEventListenerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplDamChangeEventListenerProperties`
--
INSERT INTO `comDayCqDamCoreImplDamChangeEventListenerProperties`(`changeeventlistener.observed.paths`) VALUES (?);

--
-- UPDATE template for table `comDayCqDamCoreImplDamChangeEventListenerProperties`
--
UPDATE `comDayCqDamCoreImplDamChangeEventListenerProperties` SET `changeeventlistener.observed.paths` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplDamChangeEventListenerProperties`
--
DELETE FROM `comDayCqDamCoreImplDamChangeEventListenerProperties` WHERE 0;

