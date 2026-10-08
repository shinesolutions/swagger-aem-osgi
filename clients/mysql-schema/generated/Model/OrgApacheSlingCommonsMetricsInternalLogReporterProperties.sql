--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsMetricsInternalLogReporterProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsMetricsInternalLogReporterProperties`
--
SELECT `period`, `timeUnit`, `level`, `loggerName`, `prefix`, `pattern`, `registryName` FROM `orgApacheSlingCommonsMetricsInternalLogReporterProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsMetricsInternalLogReporterProperties`
--
INSERT INTO `orgApacheSlingCommonsMetricsInternalLogReporterProperties`(`period`, `timeUnit`, `level`, `loggerName`, `prefix`, `pattern`, `registryName`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsMetricsInternalLogReporterProperties`
--
UPDATE `orgApacheSlingCommonsMetricsInternalLogReporterProperties` SET `period` = ?, `timeUnit` = ?, `level` = ?, `loggerName` = ?, `prefix` = ?, `pattern` = ?, `registryName` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsMetricsInternalLogReporterProperties`
--
DELETE FROM `orgApacheSlingCommonsMetricsInternalLogReporterProperties` WHERE 0;

