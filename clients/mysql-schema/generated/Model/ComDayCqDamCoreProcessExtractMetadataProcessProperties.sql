--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreProcessExtractMetadataProcessProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreProcessExtractMetadataProcessProperties`
--
SELECT `process.label`, `cq.dam.enable.sha1` FROM `comDayCqDamCoreProcessExtractMetadataProcessProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreProcessExtractMetadataProcessProperties`
--
INSERT INTO `comDayCqDamCoreProcessExtractMetadataProcessProperties`(`process.label`, `cq.dam.enable.sha1`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreProcessExtractMetadataProcessProperties`
--
UPDATE `comDayCqDamCoreProcessExtractMetadataProcessProperties` SET `process.label` = ?, `cq.dam.enable.sha1` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreProcessExtractMetadataProcessProperties`
--
DELETE FROM `comDayCqDamCoreProcessExtractMetadataProcessProperties` WHERE 0;

