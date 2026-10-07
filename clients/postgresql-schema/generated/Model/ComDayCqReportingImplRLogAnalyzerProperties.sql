--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReportingImplRLogAnalyzerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_reporting_impl_r_log_analyzer_properties'
--
SELECT request/log/output FROM com_day_cq_reporting_impl_r_log_analyzer_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_reporting_impl_r_log_analyzer_properties'
--
INSERT INTO com_day_cq_reporting_impl_r_log_analyzer_properties (request/log/output) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_reporting_impl_r_log_analyzer_properties'
--
UPDATE com_day_cq_reporting_impl_r_log_analyzer_properties SET request/log/output = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_reporting_impl_r_log_analyzer_properties'
--
DELETE FROM com_day_cq_reporting_impl_r_log_analyzer_properties WHERE 1=2;

