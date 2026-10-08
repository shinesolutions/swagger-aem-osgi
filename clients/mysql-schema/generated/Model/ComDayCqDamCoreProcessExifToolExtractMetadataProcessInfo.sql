--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo`
--
INSERT INTO `comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo`
--
UPDATE `comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo`
--
DELETE FROM `comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo` WHERE 0;

