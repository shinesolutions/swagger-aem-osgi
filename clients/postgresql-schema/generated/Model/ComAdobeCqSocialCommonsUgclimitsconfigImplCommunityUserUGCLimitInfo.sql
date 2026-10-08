--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user'
--
INSERT INTO com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user'
--
UPDATE com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user'
--
DELETE FROM com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user WHERE 1=2;

