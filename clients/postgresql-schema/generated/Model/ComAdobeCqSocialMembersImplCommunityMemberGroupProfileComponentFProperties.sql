--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_members_impl_community_member_group_profile'
--
SELECT everyone_limit, priority FROM com_adobe_cq_social_members_impl_community_member_group_profile WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_members_impl_community_member_group_profile'
--
INSERT INTO com_adobe_cq_social_members_impl_community_member_group_profile (everyone_limit, priority) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_members_impl_community_member_group_profile'
--
UPDATE com_adobe_cq_social_members_impl_community_member_group_profile SET everyone_limit = ?, priority = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_members_impl_community_member_group_profile'
--
DELETE FROM com_adobe_cq_social_members_impl_community_member_group_profile WHERE 1=2;

