--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_se'
--
SELECT oauth/token/revocation/active FROM com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_se WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_se'
--
INSERT INTO com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_se (oauth/token/revocation/active) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_se'
--
UPDATE com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_se SET oauth/token/revocation/active = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_se'
--
DELETE FROM com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_se WHERE 1=2;

