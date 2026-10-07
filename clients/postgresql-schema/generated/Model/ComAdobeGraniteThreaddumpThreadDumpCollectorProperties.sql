--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteThreaddumpThreadDumpCollectorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_threaddump_thread_dump_collector_properties'
--
SELECT scheduler/period, scheduler/run_on, granite/threaddump/enabled, granite/threaddump/dumps_per_file, granite/threaddump/enable_gzip_compression, granite/threaddump/enable_directories_compression, granite/threaddump/enable_j_stack, granite/threaddump/max_backup_days, granite/threaddump/backup_clean_trigger FROM com_adobe_granite_threaddump_thread_dump_collector_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_threaddump_thread_dump_collector_properties'
--
INSERT INTO com_adobe_granite_threaddump_thread_dump_collector_properties (scheduler/period, scheduler/run_on, granite/threaddump/enabled, granite/threaddump/dumps_per_file, granite/threaddump/enable_gzip_compression, granite/threaddump/enable_directories_compression, granite/threaddump/enable_j_stack, granite/threaddump/max_backup_days, granite/threaddump/backup_clean_trigger) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_threaddump_thread_dump_collector_properties'
--
UPDATE com_adobe_granite_threaddump_thread_dump_collector_properties SET scheduler/period = ?, scheduler/run_on = ?, granite/threaddump/enabled = ?, granite/threaddump/dumps_per_file = ?, granite/threaddump/enable_gzip_compression = ?, granite/threaddump/enable_directories_compression = ?, granite/threaddump/enable_j_stack = ?, granite/threaddump/max_backup_days = ?, granite/threaddump/backup_clean_trigger = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_threaddump_thread_dump_collector_properties'
--
DELETE FROM com_adobe_granite_threaddump_thread_dump_collector_properties WHERE 1=2;

