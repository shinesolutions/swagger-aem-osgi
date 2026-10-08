--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi'
--
SELECT facebook, twitter, provider/config/user/folder FROM com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi'
--
INSERT INTO com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi (facebook, twitter, provider/config/user/folder) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi'
--
UPDATE com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi SET facebook = ?, twitter = ?, provider/config/user/folder = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi'
--
DELETE FROM com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi WHERE 1=2;

