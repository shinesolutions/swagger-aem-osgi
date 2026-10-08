--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo`
--
INSERT INTO `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo`
--
UPDATE `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo`
--
DELETE FROM `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo` WHERE 0;

