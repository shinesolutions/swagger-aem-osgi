--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteAuthOauthImplGithubProviderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_auth_oauth_impl_github_provider_impl_properti'
--
SELECT oauth/provider/id, oauth/provider/github/authorization/url, oauth/provider/github/token/url, oauth/provider/github/profile/url FROM com_adobe_granite_auth_oauth_impl_github_provider_impl_properti WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_auth_oauth_impl_github_provider_impl_properti'
--
INSERT INTO com_adobe_granite_auth_oauth_impl_github_provider_impl_properti (oauth/provider/id, oauth/provider/github/authorization/url, oauth/provider/github/token/url, oauth/provider/github/profile/url) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_auth_oauth_impl_github_provider_impl_properti'
--
UPDATE com_adobe_granite_auth_oauth_impl_github_provider_impl_properti SET oauth/provider/id = ?, oauth/provider/github/authorization/url = ?, oauth/provider/github/token/url = ?, oauth/provider/github/profile/url = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_auth_oauth_impl_github_provider_impl_properti'
--
DELETE FROM com_adobe_granite_auth_oauth_impl_github_provider_impl_properti WHERE 1=2;

