--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplReportsReportPurgeServiceProperties' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplReportsReportPurgeServiceProperties`
--
SELECT `scheduler.expression`, `maxSavedReports`, `timeDuration`, `enableReportPurge` FROM `comDayCqDamCoreImplReportsReportPurgeServiceProperties` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplReportsReportPurgeServiceProperties`
--
INSERT INTO `comDayCqDamCoreImplReportsReportPurgeServiceProperties`(`scheduler.expression`, `maxSavedReports`, `timeDuration`, `enableReportPurge`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplReportsReportPurgeServiceProperties`
--
UPDATE `comDayCqDamCoreImplReportsReportPurgeServiceProperties` SET `scheduler.expression` = ?, `maxSavedReports` = ?, `timeDuration` = ?, `enableReportPurge` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplReportsReportPurgeServiceProperties`
--
DELETE FROM `comDayCqDamCoreImplReportsReportPurgeServiceProperties` WHERE 0;

