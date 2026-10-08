--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplReportsReportExportServiceInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplReportsReportExportServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplReportsReportExportServiceInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplReportsReportExportServiceInfo`
--
INSERT INTO `comDayCqDamCoreImplReportsReportExportServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplReportsReportExportServiceInfo`
--
UPDATE `comDayCqDamCoreImplReportsReportExportServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplReportsReportExportServiceInfo`
--
DELETE FROM `comDayCqDamCoreImplReportsReportExportServiceInfo` WHERE 0;

