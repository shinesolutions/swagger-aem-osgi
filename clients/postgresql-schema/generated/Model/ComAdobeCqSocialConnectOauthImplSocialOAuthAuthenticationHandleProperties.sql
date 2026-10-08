--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentica'
--
SELECT "path", service/ranking FROM com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentica WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentica'
--
INSERT INTO com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentica ("path", service/ranking) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentica'
--
UPDATE com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentica SET "path" = ?, service/ranking = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentica'
--
DELETE FROM com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentica WHERE 1=2;

