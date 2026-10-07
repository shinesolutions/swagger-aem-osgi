--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsMetricsInternalLogReporterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_metrics_internal_log_reporter_properti'
--
SELECT "period", time_unit, "level", logger_name, prefix, "pattern", registry_name FROM org_apache_sling_commons_metrics_internal_log_reporter_properti WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_metrics_internal_log_reporter_properti'
--
INSERT INTO org_apache_sling_commons_metrics_internal_log_reporter_properti ("period", time_unit, "level", logger_name, prefix, "pattern", registry_name) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_commons_metrics_internal_log_reporter_properti'
--
UPDATE org_apache_sling_commons_metrics_internal_log_reporter_properti SET "period" = ?, time_unit = ?, "level" = ?, logger_name = ?, prefix = ?, "pattern" = ?, registry_name = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_metrics_internal_log_reporter_properti'
--
DELETE FROM org_apache_sling_commons_metrics_internal_log_reporter_properti WHERE 1=2;

