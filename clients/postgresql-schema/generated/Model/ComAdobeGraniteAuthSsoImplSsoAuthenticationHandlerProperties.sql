--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_sso_impl_sso_authentication_handler_prop'
--
SELECT "path", service/ranking, jaas/control_flag, jaas/realm_name, jaas/ranking, headers, cookies, parameters, usermap, "format", trusted_credentials_attribute FROM com_adobe_granite_auth_sso_impl_sso_authentication_handler_prop WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_sso_impl_sso_authentication_handler_prop'
--
INSERT INTO com_adobe_granite_auth_sso_impl_sso_authentication_handler_prop ("path", service/ranking, jaas/control_flag, jaas/realm_name, jaas/ranking, headers, cookies, parameters, usermap, "format", trusted_credentials_attribute) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_sso_impl_sso_authentication_handler_prop'
--
UPDATE com_adobe_granite_auth_sso_impl_sso_authentication_handler_prop SET "path" = ?, service/ranking = ?, jaas/control_flag = ?, jaas/realm_name = ?, jaas/ranking = ?, headers = ?, cookies = ?, parameters = ?, usermap = ?, "format" = ?, trusted_credentials_attribute = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_sso_impl_sso_authentication_handler_prop'
--
DELETE FROM com_adobe_granite_auth_sso_impl_sso_authentication_handler_prop WHERE 1=2;

