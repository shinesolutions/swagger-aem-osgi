--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReportingImplRLogAnalyzerProperties' definition.
--


--
-- SELECT template for table `comDayCqReportingImplRLogAnalyzerProperties`
--
SELECT `request.log.output` FROM `comDayCqReportingImplRLogAnalyzerProperties` WHERE 1;

--
-- INSERT template for table `comDayCqReportingImplRLogAnalyzerProperties`
--
INSERT INTO `comDayCqReportingImplRLogAnalyzerProperties`(`request.log.output`) VALUES (?);

--
-- UPDATE template for table `comDayCqReportingImplRLogAnalyzerProperties`
--
UPDATE `comDayCqReportingImplRLogAnalyzerProperties` SET `request.log.output` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReportingImplRLogAnalyzerProperties`
--
DELETE FROM `comDayCqReportingImplRLogAnalyzerProperties` WHERE 0;

