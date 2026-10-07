--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authent'
--
SELECT pid, title, description, properties FROM com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authent WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authent'
--
INSERT INTO com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authent (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authent'
--
UPDATE com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authent SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authent'
--
DELETE FROM com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authent WHERE 1=2;

