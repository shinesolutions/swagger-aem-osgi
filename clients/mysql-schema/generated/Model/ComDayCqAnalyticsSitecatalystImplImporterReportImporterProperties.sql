--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAnalyticsSitecatalystImplImporterReportImporterProperties' definition.
--


--
-- SELECT template for table `comDayCqAnalyticsSitecatalystImplImporterReportImporterPropertie`
--
SELECT `report.fetch.attempts`, `report.fetch.delay` FROM `comDayCqAnalyticsSitecatalystImplImporterReportImporterPropertie` WHERE 1;

--
-- INSERT template for table `comDayCqAnalyticsSitecatalystImplImporterReportImporterPropertie`
--
INSERT INTO `comDayCqAnalyticsSitecatalystImplImporterReportImporterPropertie`(`report.fetch.attempts`, `report.fetch.delay`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqAnalyticsSitecatalystImplImporterReportImporterPropertie`
--
UPDATE `comDayCqAnalyticsSitecatalystImplImporterReportImporterPropertie` SET `report.fetch.attempts` = ?, `report.fetch.delay` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAnalyticsSitecatalystImplImporterReportImporterPropertie`
--
DELETE FROM `comDayCqAnalyticsSitecatalystImplImporterReportImporterPropertie` WHERE 0;

