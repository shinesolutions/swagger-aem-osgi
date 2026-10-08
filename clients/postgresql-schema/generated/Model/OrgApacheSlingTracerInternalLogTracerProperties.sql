--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingTracerInternalLogTracerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_tracer_internal_log_tracer_properties'
--
SELECT tracer_sets, enabled, servlet_enabled, recording_cache_size_in_mb, recording_cache_duration_in_secs, recording_compression_enabled, gzip_response FROM org_apache_sling_tracer_internal_log_tracer_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_tracer_internal_log_tracer_properties'
--
INSERT INTO org_apache_sling_tracer_internal_log_tracer_properties (tracer_sets, enabled, servlet_enabled, recording_cache_size_in_mb, recording_cache_duration_in_secs, recording_compression_enabled, gzip_response) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_tracer_internal_log_tracer_properties'
--
UPDATE org_apache_sling_tracer_internal_log_tracer_properties SET tracer_sets = ?, enabled = ?, servlet_enabled = ?, recording_cache_size_in_mb = ?, recording_cache_duration_in_secs = ?, recording_compression_enabled = ?, gzip_response = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_tracer_internal_log_tracer_properties'
--
DELETE FROM org_apache_sling_tracer_internal_log_tracer_properties WHERE 1=2;

