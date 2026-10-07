--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties`
--
SELECT `createPreviewEnabled`, `updatePreviewEnabled`, `queueSize`, `folderPreviewRenditionRegex` FROM `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties`
--
INSERT INTO `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties`(`createPreviewEnabled`, `updatePreviewEnabled`, `queueSize`, `folderPreviewRenditionRegex`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties`
--
UPDATE `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties` SET `createPreviewEnabled` = ?, `updatePreviewEnabled` = ?, `queueSize` = ?, `folderPreviewRenditionRegex` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties`
--
DELETE FROM `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties` WHERE 0;

