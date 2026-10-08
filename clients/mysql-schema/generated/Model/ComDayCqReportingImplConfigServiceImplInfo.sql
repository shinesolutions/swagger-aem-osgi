--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqReportingImplConfigServiceImplInfo' definition.
--


--
-- SELECT template for table `comDayCqReportingImplConfigServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCqReportingImplConfigServiceImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqReportingImplConfigServiceImplInfo`
--
INSERT INTO `comDayCqReportingImplConfigServiceImplInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqReportingImplConfigServiceImplInfo`
--
UPDATE `comDayCqReportingImplConfigServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCqReportingImplConfigServiceImplInfo`
--
DELETE FROM `comDayCqReportingImplConfigServiceImplInfo` WHERE 0;

