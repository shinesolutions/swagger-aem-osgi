--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties' definition.
--


--
-- SELECT template for table `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteP`
--
SELECT `allowed.paths`, `cq.analytics.saint.exporter.pagesize` FROM `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteP` WHERE 1;

--
-- INSERT template for table `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteP`
--
INSERT INTO `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteP`(`allowed.paths`, `cq.analytics.saint.exporter.pagesize`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteP`
--
UPDATE `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteP` SET `allowed.paths` = ?, `cq.analytics.saint.exporter.pagesize` = ? WHERE 1;

--
-- DELETE template for table `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteP`
--
DELETE FROM `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteP` WHERE 0;

