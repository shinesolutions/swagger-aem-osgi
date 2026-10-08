--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_members_endpoints_impl_community_member_gro'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_members_endpoints_impl_community_member_gro WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_members_endpoints_impl_community_member_gro'
--
INSERT INTO com_adobe_cq_social_members_endpoints_impl_community_member_gro (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_members_endpoints_impl_community_member_gro'
--
UPDATE com_adobe_cq_social_members_endpoints_impl_community_member_gro SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_members_endpoints_impl_community_member_gro'
--
DELETE FROM com_adobe_cq_social_members_endpoints_impl_community_member_gro WHERE 1=2;

