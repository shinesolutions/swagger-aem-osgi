--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEngineImplLogRequestLoggerServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_engine_impl_log_request_logger_service_propert'
--
SELECT request/log/service/format, request/log/service/output, request/log/service/outputtype, request/log/service/onentry FROM org_apache_sling_engine_impl_log_request_logger_service_propert WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_engine_impl_log_request_logger_service_propert'
--
INSERT INTO org_apache_sling_engine_impl_log_request_logger_service_propert (request/log/service/format, request/log/service/output, request/log/service/outputtype, request/log/service/onentry) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_engine_impl_log_request_logger_service_propert'
--
UPDATE org_apache_sling_engine_impl_log_request_logger_service_propert SET request/log/service/format = ?, request/log/service/output = ?, request/log/service/outputtype = ?, request/log/service/onentry = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_engine_impl_log_request_logger_service_propert'
--
DELETE FROM org_apache_sling_engine_impl_log_request_logger_service_propert WHERE 1=2;

