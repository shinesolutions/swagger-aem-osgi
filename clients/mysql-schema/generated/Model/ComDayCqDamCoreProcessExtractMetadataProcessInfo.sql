--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreProcessExtractMetadataProcessInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreProcessExtractMetadataProcessInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreProcessExtractMetadataProcessInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreProcessExtractMetadataProcessInfo`
--
INSERT INTO `comDayCqDamCoreProcessExtractMetadataProcessInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreProcessExtractMetadataProcessInfo`
--
UPDATE `comDayCqDamCoreProcessExtractMetadataProcessInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreProcessExtractMetadataProcessInfo`
--
DELETE FROM `comDayCqDamCoreProcessExtractMetadataProcessInfo` WHERE 0;

