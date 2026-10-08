--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_p'
--
SELECT oauth/provider/id, oauth/cloud/config/root, provider/config/root, provider/config/create/tags/enabled, provider/config/user/folder, provider/config/facebook/fetch/fields, provider/config/facebook/fields, provider/config/refresh/userdata/enabled FROM com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_p WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_p'
--
INSERT INTO com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_p (oauth/provider/id, oauth/cloud/config/root, provider/config/root, provider/config/create/tags/enabled, provider/config/user/folder, provider/config/facebook/fetch/fields, provider/config/facebook/fields, provider/config/refresh/userdata/enabled) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_p'
--
UPDATE com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_p SET oauth/provider/id = ?, oauth/cloud/config/root = ?, provider/config/root = ?, provider/config/create/tags/enabled = ?, provider/config/user/folder = ?, provider/config/facebook/fetch/fields = ?, provider/config/facebook/fields = ?, provider/config/refresh/userdata/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_p'
--
DELETE FROM com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_p WHERE 1=2;

