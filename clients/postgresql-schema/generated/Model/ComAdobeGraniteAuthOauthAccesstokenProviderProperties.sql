--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthAccesstokenProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_oauth_accesstoken_provider_properties'
--
SELECT "name", auth/token/provider/title, auth/token/provider/default/claims, auth/token/provider/endpoint, auth/access/token/request, auth/token/provider/keypair/alias, auth/token/provider/conn/timeout, auth/token/provider/so/timeout, auth/token/provider/client/id, auth/token/provider/scope, auth/token/provider/reuse/access/token, auth/token/provider/relaxed/ssl, token/request/customizer/type, auth/token/validator/type FROM com_adobe_granite_auth_oauth_accesstoken_provider_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_oauth_accesstoken_provider_properties'
--
INSERT INTO com_adobe_granite_auth_oauth_accesstoken_provider_properties ("name", auth/token/provider/title, auth/token/provider/default/claims, auth/token/provider/endpoint, auth/access/token/request, auth/token/provider/keypair/alias, auth/token/provider/conn/timeout, auth/token/provider/so/timeout, auth/token/provider/client/id, auth/token/provider/scope, auth/token/provider/reuse/access/token, auth/token/provider/relaxed/ssl, token/request/customizer/type, auth/token/validator/type) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_oauth_accesstoken_provider_properties'
--
UPDATE com_adobe_granite_auth_oauth_accesstoken_provider_properties SET "name" = ?, auth/token/provider/title = ?, auth/token/provider/default/claims = ?, auth/token/provider/endpoint = ?, auth/access/token/request = ?, auth/token/provider/keypair/alias = ?, auth/token/provider/conn/timeout = ?, auth/token/provider/so/timeout = ?, auth/token/provider/client/id = ?, auth/token/provider/scope = ?, auth/token/provider/reuse/access/token = ?, auth/token/provider/relaxed/ssl = ?, token/request/customizer/type = ?, auth/token/validator/type = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_oauth_accesstoken_provider_properties'
--
DELETE FROM com_adobe_granite_auth_oauth_accesstoken_provider_properties WHERE 1=2;

