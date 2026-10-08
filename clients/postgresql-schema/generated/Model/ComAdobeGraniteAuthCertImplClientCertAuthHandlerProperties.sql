--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_cert_impl_client_cert_auth_handler_prope'
--
SELECT "path", service/ranking FROM com_adobe_granite_auth_cert_impl_client_cert_auth_handler_prope WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_cert_impl_client_cert_auth_handler_prope'
--
INSERT INTO com_adobe_granite_auth_cert_impl_client_cert_auth_handler_prope ("path", service/ranking) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_cert_impl_client_cert_auth_handler_prope'
--
UPDATE com_adobe_granite_auth_cert_impl_client_cert_auth_handler_prope SET "path" = ?, service/ranking = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_cert_impl_client_cert_auth_handler_prope'
--
DELETE FROM com_adobe_granite_auth_cert_impl_client_cert_auth_handler_prope WHERE 1=2;

