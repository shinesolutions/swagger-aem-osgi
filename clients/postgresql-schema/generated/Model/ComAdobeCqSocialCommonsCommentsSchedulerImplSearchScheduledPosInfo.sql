--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_comments_scheduler_impl_search_sche'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_commons_comments_scheduler_impl_search_sche WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_comments_scheduler_impl_search_sche'
--
INSERT INTO com_adobe_cq_social_commons_comments_scheduler_impl_search_sche (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_comments_scheduler_impl_search_sche'
--
UPDATE com_adobe_cq_social_commons_comments_scheduler_impl_search_sche SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_comments_scheduler_impl_search_sche'
--
DELETE FROM com_adobe_cq_social_commons_comments_scheduler_impl_search_sche WHERE 1=2;

