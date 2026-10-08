--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsLogLogManagerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_log_log_manager_properties'
--
SELECT org/apache/sling/commons/log/level, org/apache/sling/commons/log/file, org/apache/sling/commons/log/file/number, org/apache/sling/commons/log/file/size, org/apache/sling/commons/log/pattern, org/apache/sling/commons/log/configuration_file, org/apache/sling/commons/log/packaging_data_enabled, org/apache/sling/commons/log/max_caller_data_depth, org/apache/sling/commons/log/max_old_file_count_in_dump, org/apache/sling/commons/log/num_of_lines FROM org_apache_sling_commons_log_log_manager_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_log_log_manager_properties'
--
INSERT INTO org_apache_sling_commons_log_log_manager_properties (org/apache/sling/commons/log/level, org/apache/sling/commons/log/file, org/apache/sling/commons/log/file/number, org/apache/sling/commons/log/file/size, org/apache/sling/commons/log/pattern, org/apache/sling/commons/log/configuration_file, org/apache/sling/commons/log/packaging_data_enabled, org/apache/sling/commons/log/max_caller_data_depth, org/apache/sling/commons/log/max_old_file_count_in_dump, org/apache/sling/commons/log/num_of_lines) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_commons_log_log_manager_properties'
--
UPDATE org_apache_sling_commons_log_log_manager_properties SET org/apache/sling/commons/log/level = ?, org/apache/sling/commons/log/file = ?, org/apache/sling/commons/log/file/number = ?, org/apache/sling/commons/log/file/size = ?, org/apache/sling/commons/log/pattern = ?, org/apache/sling/commons/log/configuration_file = ?, org/apache/sling/commons/log/packaging_data_enabled = ?, org/apache/sling/commons/log/max_caller_data_depth = ?, org/apache/sling/commons/log/max_old_file_count_in_dump = ?, org/apache/sling/commons/log/num_of_lines = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_log_log_manager_properties'
--
DELETE FROM org_apache_sling_commons_log_log_manager_properties WHERE 1=2;

