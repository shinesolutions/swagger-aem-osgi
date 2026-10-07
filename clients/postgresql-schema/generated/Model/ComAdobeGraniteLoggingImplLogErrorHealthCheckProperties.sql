--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteLoggingImplLogErrorHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_logging_impl_log_error_health_check_propertie'
--
SELECT hc/tags FROM com_adobe_granite_logging_impl_log_error_health_check_propertie WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_logging_impl_log_error_health_check_propertie'
--
INSERT INTO com_adobe_granite_logging_impl_log_error_health_check_propertie (hc/tags) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_logging_impl_log_error_health_check_propertie'
--
UPDATE com_adobe_granite_logging_impl_log_error_health_check_propertie SET hc/tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_logging_impl_log_error_health_check_propertie'
--
DELETE FROM com_adobe_granite_logging_impl_log_error_health_check_propertie WHERE 1=2;

