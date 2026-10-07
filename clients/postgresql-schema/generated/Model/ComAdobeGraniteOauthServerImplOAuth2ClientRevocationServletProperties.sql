--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_s'
--
SELECT oauth/client/revocation/active FROM com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_s WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_s'
--
INSERT INTO com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_s (oauth/client/revocation/active) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_s'
--
UPDATE com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_s SET oauth/client/revocation/active = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_s'
--
DELETE FROM com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_s WHERE 1=2;

