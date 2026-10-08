--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplGraniteProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_oauth_impl_granite_provider_properties'
--
SELECT oauth/provider/id, oauth/provider/granite/authorization/url, oauth/provider/granite/token/url, oauth/provider/granite/profile/url, oauth/provider/granite/extended/details/urls FROM com_adobe_granite_auth_oauth_impl_granite_provider_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_oauth_impl_granite_provider_properties'
--
INSERT INTO com_adobe_granite_auth_oauth_impl_granite_provider_properties (oauth/provider/id, oauth/provider/granite/authorization/url, oauth/provider/granite/token/url, oauth/provider/granite/profile/url, oauth/provider/granite/extended/details/urls) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_oauth_impl_granite_provider_properties'
--
UPDATE com_adobe_granite_auth_oauth_impl_granite_provider_properties SET oauth/provider/id = ?, oauth/provider/granite/authorization/url = ?, oauth/provider/granite/token/url = ?, oauth/provider/granite/profile/url = ?, oauth/provider/granite/extended/details/urls = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_oauth_impl_granite_provider_properties'
--
DELETE FROM com_adobe_granite_auth_oauth_impl_granite_provider_properties WHERE 1=2;

