--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_re'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_re WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_re'
--
INSERT INTO org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_re (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_re'
--
UPDATE org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_re SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_re'
--
DELETE FROM org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_re WHERE 1=2;

