--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmCoreWCMRequestFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_core_wcm_request_filter_properties'
--
SELECT wcmfilter/mode FROM com_day_cq_wcm_core_wcm_request_filter_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_core_wcm_request_filter_properties'
--
INSERT INTO com_day_cq_wcm_core_wcm_request_filter_properties (wcmfilter/mode) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_wcm_core_wcm_request_filter_properties'
--
UPDATE com_day_cq_wcm_core_wcm_request_filter_properties SET wcmfilter/mode = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_core_wcm_request_filter_properties'
--
DELETE FROM com_day_cq_wcm_core_wcm_request_filter_properties WHERE 1=2;

