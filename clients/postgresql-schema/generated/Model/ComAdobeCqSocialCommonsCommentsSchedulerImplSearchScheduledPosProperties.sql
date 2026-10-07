--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_comments_scheduler_impl_search_sche'
--
SELECT enable_scheduled_posts_search, number_of_minutes, max_search_limit FROM com_adobe_cq_social_commons_comments_scheduler_impl_search_sche WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_comments_scheduler_impl_search_sche'
--
INSERT INTO com_adobe_cq_social_commons_comments_scheduler_impl_search_sche (enable_scheduled_posts_search, number_of_minutes, max_search_limit) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_comments_scheduler_impl_search_sche'
--
UPDATE com_adobe_cq_social_commons_comments_scheduler_impl_search_sche SET enable_scheduled_posts_search = ?, number_of_minutes = ?, max_search_limit = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_comments_scheduler_impl_search_sche'
--
DELETE FROM com_adobe_cq_social_commons_comments_scheduler_impl_search_sche WHERE 1=2;

