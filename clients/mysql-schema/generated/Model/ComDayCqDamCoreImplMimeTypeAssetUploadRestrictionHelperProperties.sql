--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertie`
--
SELECT `cq.dam.allow.all.mime`, `cq.dam.allowed.asset.mimes` FROM `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertie` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertie`
--
INSERT INTO `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertie`(`cq.dam.allow.all.mime`, `cq.dam.allowed.asset.mimes`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertie`
--
UPDATE `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertie` SET `cq.dam.allow.all.mime` = ?, `cq.dam.allowed.asset.mimes` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertie`
--
DELETE FROM `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertie` WHERE 0;

