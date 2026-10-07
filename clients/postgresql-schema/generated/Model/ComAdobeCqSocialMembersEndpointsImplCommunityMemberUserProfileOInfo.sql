--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_members_endpoints_impl_community_member_use'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_members_endpoints_impl_community_member_use WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_members_endpoints_impl_community_member_use'
--
INSERT INTO com_adobe_cq_social_members_endpoints_impl_community_member_use (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_members_endpoints_impl_community_member_use'
--
UPDATE com_adobe_cq_social_members_endpoints_impl_community_member_use SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_members_endpoints_impl_community_member_use'
--
DELETE FROM com_adobe_cq_social_members_endpoints_impl_community_member_use WHERE 1=2;

