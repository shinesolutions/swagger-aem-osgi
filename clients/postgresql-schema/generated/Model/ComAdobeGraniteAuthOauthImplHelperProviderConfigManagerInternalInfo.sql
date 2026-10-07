--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_oauth_impl_helper_provider_config_manage'
--
SELECT pid, title, description, properties FROM com_adobe_granite_auth_oauth_impl_helper_provider_config_manage WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_oauth_impl_helper_provider_config_manage'
--
INSERT INTO com_adobe_granite_auth_oauth_impl_helper_provider_config_manage (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_oauth_impl_helper_provider_config_manage'
--
UPDATE com_adobe_granite_auth_oauth_impl_helper_provider_config_manage SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_oauth_impl_helper_provider_config_manage'
--
DELETE FROM com_adobe_granite_auth_oauth_impl_helper_provider_config_manage WHERE 1=2;

