--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_requests_logging_impl_hc_requests_status_heal'
--
SELECT hc/tags FROM com_adobe_granite_requests_logging_impl_hc_requests_status_heal WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_requests_logging_impl_hc_requests_status_heal'
--
INSERT INTO com_adobe_granite_requests_logging_impl_hc_requests_status_heal (hc/tags) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_requests_logging_impl_hc_requests_status_heal'
--
UPDATE com_adobe_granite_requests_logging_impl_hc_requests_status_heal SET hc/tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_requests_logging_impl_hc_requests_status_heal'
--
DELETE FROM com_adobe_granite_requests_logging_impl_hc_requests_status_heal WHERE 1=2;

