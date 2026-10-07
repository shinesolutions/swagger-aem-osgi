--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_pr'
--
SELECT oauth/provider/id, oauth/cloud/config/root, provider/config/root, provider/config/user/folder, provider/config/twitter/enable/params, provider/config/twitter/params, provider/config/refresh/userdata/enabled FROM com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_pr'
--
INSERT INTO com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_pr (oauth/provider/id, oauth/cloud/config/root, provider/config/root, provider/config/user/folder, provider/config/twitter/enable/params, provider/config/twitter/params, provider/config/refresh/userdata/enabled) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_pr'
--
UPDATE com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_pr SET oauth/provider/id = ?, oauth/cloud/config/root = ?, provider/config/root = ?, provider/config/user/folder = ?, provider/config/twitter/enable/params = ?, provider/config/twitter/params = ?, provider/config/refresh/userdata/enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_pr'
--
DELETE FROM com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_pr WHERE 1=2;

