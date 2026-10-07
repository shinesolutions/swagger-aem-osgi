--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplRenditionMakerImplInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplRenditionMakerImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplRenditionMakerImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplRenditionMakerImplInfo`
--
INSERT INTO `comDayCqDamCoreImplRenditionMakerImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplRenditionMakerImplInfo`
--
UPDATE `comDayCqDamCoreImplRenditionMakerImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplRenditionMakerImplInfo`
--
DELETE FROM `comDayCqDamCoreImplRenditionMakerImplInfo` WHERE 0;

