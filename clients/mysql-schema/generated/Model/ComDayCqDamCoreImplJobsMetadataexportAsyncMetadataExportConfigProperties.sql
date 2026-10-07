--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPr`
--
SELECT `operation`, `emailEnabled` FROM `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPr` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPr`
--
INSERT INTO `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPr`(`operation`, `emailEnabled`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPr`
--
UPDATE `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPr` SET `operation` = ?, `emailEnabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPr`
--
DELETE FROM `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPr` WHERE 0;

