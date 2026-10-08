--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqStatisticsImplStatisticsServiceImplProperties' definition.
--


--
-- SELECT template for table `comDayCqStatisticsImplStatisticsServiceImplProperties`
--
SELECT `scheduler.period`, `scheduler.concurrent`, `path`, `workspace`, `keywordsPath`, `asyncEntries` FROM `comDayCqStatisticsImplStatisticsServiceImplProperties` WHERE 1;

--
-- INSERT template for table `comDayCqStatisticsImplStatisticsServiceImplProperties`
--
INSERT INTO `comDayCqStatisticsImplStatisticsServiceImplProperties`(`scheduler.period`, `scheduler.concurrent`, `path`, `workspace`, `keywordsPath`, `asyncEntries`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqStatisticsImplStatisticsServiceImplProperties`
--
UPDATE `comDayCqStatisticsImplStatisticsServiceImplProperties` SET `scheduler.period` = ?, `scheduler.concurrent` = ?, `path` = ?, `workspace` = ?, `keywordsPath` = ?, `asyncEntries` = ? WHERE 1;

--
-- DELETE template for table `comDayCqStatisticsImplStatisticsServiceImplProperties`
--
DELETE FROM `comDayCqStatisticsImplStatisticsServiceImplProperties` WHERE 0;

