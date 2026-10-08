--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReportingImplRLogAnalyzerInfo' definition.
--


--
-- SELECT template for table `comDayCqReportingImplRLogAnalyzerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqReportingImplRLogAnalyzerInfo` WHERE 1;

--
-- INSERT template for table `comDayCqReportingImplRLogAnalyzerInfo`
--
INSERT INTO `comDayCqReportingImplRLogAnalyzerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReportingImplRLogAnalyzerInfo`
--
UPDATE `comDayCqReportingImplRLogAnalyzerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReportingImplRLogAnalyzerInfo`
--
DELETE FROM `comDayCqReportingImplRLogAnalyzerInfo` WHERE 0;

