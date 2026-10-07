--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProp`
--
SELECT `datasources`, `step`, `archives`, `path` FROM `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProp` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProp`
--
INSERT INTO `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProp`(`datasources`, `step`, `archives`, `path`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProp`
--
UPDATE `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProp` SET `datasources` = ?, `step` = ?, `archives` = ?, `path` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProp`
--
DELETE FROM `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProp` WHERE 0;

