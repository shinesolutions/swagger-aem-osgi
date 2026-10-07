--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigIn` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigIn`
--
INSERT INTO `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigIn`
--
UPDATE `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigIn`
--
DELETE FROM `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigIn` WHERE 0;

