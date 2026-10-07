--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user'
--
SELECT "enable", ugc_limit, ugc_limit_duration, domains, to_list FROM com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user'
--
INSERT INTO com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user ("enable", ugc_limit, ugc_limit_duration, domains, to_list) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user'
--
UPDATE com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user SET "enable" = ?, ugc_limit = ?, ugc_limit_duration = ?, domains = ?, to_list = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user'
--
DELETE FROM com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user WHERE 1=2;

