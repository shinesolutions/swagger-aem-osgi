--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_engine_impl_debug_request_progress_tracker_log'
--
SELECT extensions, min_duration_ms, max_duration_ms, compact_log_format FROM org_apache_sling_engine_impl_debug_request_progress_tracker_log WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_engine_impl_debug_request_progress_tracker_log'
--
INSERT INTO org_apache_sling_engine_impl_debug_request_progress_tracker_log (extensions, min_duration_ms, max_duration_ms, compact_log_format) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_engine_impl_debug_request_progress_tracker_log'
--
UPDATE org_apache_sling_engine_impl_debug_request_progress_tracker_log SET extensions = ?, min_duration_ms = ?, max_duration_ms = ?, compact_log_format = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_engine_impl_debug_request_progress_tracker_log'
--
DELETE FROM org_apache_sling_engine_impl_debug_request_progress_tracker_log WHERE 1=2;

