--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo`
--
INSERT INTO `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo`
--
UPDATE `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo`
--
DELETE FROM `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo` WHERE 0;

