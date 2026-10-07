--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreProcessMetadataProcessorProcessProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreProcessMetadataProcessorProcessProperties`
--
SELECT `process.label`, `cq.dam.enable.sha1`, `cq.dam.metadata.xssprotected.properties` FROM `comDayCqDamCoreProcessMetadataProcessorProcessProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreProcessMetadataProcessorProcessProperties`
--
INSERT INTO `comDayCqDamCoreProcessMetadataProcessorProcessProperties`(`process.label`, `cq.dam.enable.sha1`, `cq.dam.metadata.xssprotected.properties`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreProcessMetadataProcessorProcessProperties`
--
UPDATE `comDayCqDamCoreProcessMetadataProcessorProcessProperties` SET `process.label` = ?, `cq.dam.enable.sha1` = ?, `cq.dam.metadata.xssprotected.properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreProcessMetadataProcessorProcessProperties`
--
DELETE FROM `comDayCqDamCoreProcessMetadataProcessorProcessProperties` WHERE 0;

