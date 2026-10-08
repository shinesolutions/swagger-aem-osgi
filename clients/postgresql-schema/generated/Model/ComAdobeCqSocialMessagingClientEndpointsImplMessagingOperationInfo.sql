--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o'
--
INSERT INTO com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o'
--
UPDATE com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o'
--
DELETE FROM com_adobe_cq_social_messaging_client_endpoints_impl_messaging_o WHERE 1=2;

