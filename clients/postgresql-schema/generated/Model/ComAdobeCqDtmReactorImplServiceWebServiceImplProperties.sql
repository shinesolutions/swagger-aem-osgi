--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDtmReactorImplServiceWebServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properti'
--
SELECT endpoint_uri, connection_timeout, socket_timeout FROM com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properti WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properti'
--
INSERT INTO com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properti (endpoint_uri, connection_timeout, socket_timeout) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properti'
--
UPDATE com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properti SET endpoint_uri = ?, connection_timeout = ?, socket_timeout = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properti'
--
DELETE FROM com_adobe_cq_dtm_reactor_impl_service_web_service_impl_properti WHERE 1=2;

