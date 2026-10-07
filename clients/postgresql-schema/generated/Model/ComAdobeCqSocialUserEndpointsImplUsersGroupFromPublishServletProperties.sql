--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_user_endpoints_impl_users_group_from_publis'
--
SELECT sling/servlet/extensions, sling/servlet/paths, sling/servlet/methods FROM com_adobe_cq_social_user_endpoints_impl_users_group_from_publis WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_user_endpoints_impl_users_group_from_publis'
--
INSERT INTO com_adobe_cq_social_user_endpoints_impl_users_group_from_publis (sling/servlet/extensions, sling/servlet/paths, sling/servlet/methods) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_user_endpoints_impl_users_group_from_publis'
--
UPDATE com_adobe_cq_social_user_endpoints_impl_users_group_from_publis SET sling/servlet/extensions = ?, sling/servlet/paths = ?, sling/servlet/methods = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_user_endpoints_impl_users_group_from_publis'
--
DELETE FROM com_adobe_cq_social_user_endpoints_impl_users_group_from_publis WHERE 1=2;

