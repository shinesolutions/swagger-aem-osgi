--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint'
--
SELECT sling/servlet/paths, oauth/revocation/active FROM com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint'
--
INSERT INTO com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint (sling/servlet/paths, oauth/revocation/active) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint'
--
UPDATE com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint SET sling/servlet/paths = ?, oauth/revocation/active = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint'
--
DELETE FROM com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint WHERE 1=2;

