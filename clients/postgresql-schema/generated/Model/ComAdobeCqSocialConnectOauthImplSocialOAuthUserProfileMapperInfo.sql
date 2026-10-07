--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi'
--
INSERT INTO com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi'
--
UPDATE com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi'
--
DELETE FROM com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profi WHERE 1=2;

