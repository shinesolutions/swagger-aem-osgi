--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_oauth_impl_bearer_authentication_handler'
--
SELECT "path", oauth/client_ids/allowed, auth/bearer/sync/ims, auth/token_request_parameter, oauth/bearer/configid, oauth/jwt/support FROM com_adobe_granite_auth_oauth_impl_bearer_authentication_handler WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_oauth_impl_bearer_authentication_handler'
--
INSERT INTO com_adobe_granite_auth_oauth_impl_bearer_authentication_handler ("path", oauth/client_ids/allowed, auth/bearer/sync/ims, auth/token_request_parameter, oauth/bearer/configid, oauth/jwt/support) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_oauth_impl_bearer_authentication_handler'
--
UPDATE com_adobe_granite_auth_oauth_impl_bearer_authentication_handler SET "path" = ?, oauth/client_ids/allowed = ?, auth/bearer/sync/ims = ?, auth/token_request_parameter = ?, oauth/bearer/configid = ?, oauth/jwt/support = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_oauth_impl_bearer_authentication_handler'
--
DELETE FROM com_adobe_granite_auth_oauth_impl_bearer_authentication_handler WHERE 1=2;

