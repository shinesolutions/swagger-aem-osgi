--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEngineImplLogRequestLoggerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_engine_impl_log_request_logger_properties'
--
SELECT request/log/output, request/log/outputtype, request/log/enabled, access/log/output, access/log/outputtype, access/log/enabled FROM org_apache_sling_engine_impl_log_request_logger_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_engine_impl_log_request_logger_properties'
--
INSERT INTO org_apache_sling_engine_impl_log_request_logger_properties (request/log/output, request/log/outputtype, request/log/enabled, access/log/output, access/log/outputtype, access/log/enabled) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_engine_impl_log_request_logger_properties'
--
UPDATE org_apache_sling_engine_impl_log_request_logger_properties SET request/log/output = ?, request/log/outputtype = ?, request/log/enabled = ?, access/log/output = ?, access/log/outputtype = ?, access/log/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_engine_impl_log_request_logger_properties'
--
DELETE FROM org_apache_sling_engine_impl_log_request_logger_properties WHERE 1=2;

