--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplReportsReportPurgeServiceInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplReportsReportPurgeServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqDamCoreImplReportsReportPurgeServiceInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplReportsReportPurgeServiceInfo`
--
INSERT INTO `comDayCqDamCoreImplReportsReportPurgeServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplReportsReportPurgeServiceInfo`
--
UPDATE `comDayCqDamCoreImplReportsReportPurgeServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplReportsReportPurgeServiceInfo`
--
DELETE FROM `comDayCqDamCoreImplReportsReportPurgeServiceInfo` WHERE 0;

