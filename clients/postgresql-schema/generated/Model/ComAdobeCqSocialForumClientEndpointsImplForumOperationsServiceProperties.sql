--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_forum_client_endpoints_impl_forum_operation'
--
SELECT field_whitelist, attachment_type_blacklist FROM com_adobe_cq_social_forum_client_endpoints_impl_forum_operation WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_forum_client_endpoints_impl_forum_operation'
--
INSERT INTO com_adobe_cq_social_forum_client_endpoints_impl_forum_operation (field_whitelist, attachment_type_blacklist) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_forum_client_endpoints_impl_forum_operation'
--
UPDATE com_adobe_cq_social_forum_client_endpoints_impl_forum_operation SET field_whitelist = ?, attachment_type_blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_forum_client_endpoints_impl_forum_operation'
--
DELETE FROM com_adobe_cq_social_forum_client_endpoints_impl_forum_operation WHERE 1=2;

