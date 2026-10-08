--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsMetricsInternalLogReporterInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsMetricsInternalLogReporterInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingCommonsMetricsInternalLogReporterInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsMetricsInternalLogReporterInfo`
--
INSERT INTO `orgApacheSlingCommonsMetricsInternalLogReporterInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsMetricsInternalLogReporterInfo`
--
UPDATE `orgApacheSlingCommonsMetricsInternalLogReporterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsMetricsInternalLogReporterInfo`
--
DELETE FROM `orgApacheSlingCommonsMetricsInternalLogReporterInfo` WHERE 0;

