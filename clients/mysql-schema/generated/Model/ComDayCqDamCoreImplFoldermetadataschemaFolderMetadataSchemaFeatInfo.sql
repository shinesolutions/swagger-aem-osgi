--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatI` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatI`
--
INSERT INTO `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatI`
--
UPDATE `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatI`
--
DELETE FROM `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatI` WHERE 0;

