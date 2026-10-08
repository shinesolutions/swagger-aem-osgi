--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_analytics_testandtarget_impl_service_web_service_imp'
--
SELECT endpoint_uri, connection_timeout, socket_timeout FROM com_day_cq_analytics_testandtarget_impl_service_web_service_imp WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_analytics_testandtarget_impl_service_web_service_imp'
--
INSERT INTO com_day_cq_analytics_testandtarget_impl_service_web_service_imp (endpoint_uri, connection_timeout, socket_timeout) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_analytics_testandtarget_impl_service_web_service_imp'
--
UPDATE com_day_cq_analytics_testandtarget_impl_service_web_service_imp SET endpoint_uri = ?, connection_timeout = ?, socket_timeout = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_analytics_testandtarget_impl_service_web_service_imp'
--
DELETE FROM com_day_cq_analytics_testandtarget_impl_service_web_service_imp WHERE 1=2;

