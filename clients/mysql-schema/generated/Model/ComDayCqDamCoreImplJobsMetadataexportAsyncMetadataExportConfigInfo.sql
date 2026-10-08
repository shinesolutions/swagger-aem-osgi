--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigIn` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigIn`
--
INSERT INTO `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigIn`
--
UPDATE `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigIn`
--
DELETE FROM `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigIn` WHERE 0;

