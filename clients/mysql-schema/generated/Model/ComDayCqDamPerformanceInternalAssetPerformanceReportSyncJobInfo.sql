--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo' definition.
--


--
-- SELECT template for table `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo`
--
INSERT INTO `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo`
--
UPDATE `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo`
--
DELETE FROM `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo` WHERE 0;

