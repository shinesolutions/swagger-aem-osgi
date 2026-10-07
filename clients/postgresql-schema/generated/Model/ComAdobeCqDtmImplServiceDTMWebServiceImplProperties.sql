--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDtmImplServiceDTMWebServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties'
--
SELECT connection/timeout, socket/timeout FROM com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties'
--
INSERT INTO com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties (connection/timeout, socket/timeout) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties'
--
UPDATE com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties SET connection/timeout = ?, socket/timeout = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties'
--
DELETE FROM com_adobe_cq_dtm_impl_service_dtm_web_service_impl_properties WHERE 1=2;

