--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service'
--
SELECT event/topics, event/filter, verbs FROM com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service'
--
INSERT INTO com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service (event/topics, event/filter, verbs) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service'
--
UPDATE com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service SET event/topics = ?, event/filter = ?, verbs = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service'
--
DELETE FROM com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service WHERE 1=2;

