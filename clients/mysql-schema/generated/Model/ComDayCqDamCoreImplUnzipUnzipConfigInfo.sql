--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplUnzipUnzipConfigInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplUnzipUnzipConfigInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplUnzipUnzipConfigInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplUnzipUnzipConfigInfo`
--
INSERT INTO `comDayCqDamCoreImplUnzipUnzipConfigInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplUnzipUnzipConfigInfo`
--
UPDATE `comDayCqDamCoreImplUnzipUnzipConfigInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplUnzipUnzipConfigInfo`
--
DELETE FROM `comDayCqDamCoreImplUnzipUnzipConfigInfo` WHERE 0;

