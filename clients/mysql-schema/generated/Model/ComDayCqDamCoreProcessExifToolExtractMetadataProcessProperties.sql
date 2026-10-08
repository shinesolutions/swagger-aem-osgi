--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties`
--
SELECT `process.label`, `cq.dam.enable.sha1` FROM `comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties`
--
INSERT INTO `comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties`(`process.label`, `cq.dam.enable.sha1`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties`
--
UPDATE `comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties` SET `process.label` = ?, `cq.dam.enable.sha1` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties`
--
DELETE FROM `comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties` WHERE 0;

