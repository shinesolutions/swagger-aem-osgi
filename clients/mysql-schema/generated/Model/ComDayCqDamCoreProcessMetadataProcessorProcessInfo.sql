--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreProcessMetadataProcessorProcessInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreProcessMetadataProcessorProcessInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreProcessMetadataProcessorProcessInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreProcessMetadataProcessorProcessInfo`
--
INSERT INTO `comDayCqDamCoreProcessMetadataProcessorProcessInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreProcessMetadataProcessorProcessInfo`
--
UPDATE `comDayCqDamCoreProcessMetadataProcessorProcessInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreProcessMetadataProcessorProcessInfo`
--
DELETE FROM `comDayCqDamCoreProcessMetadataProcessorProcessInfo` WHERE 0;

