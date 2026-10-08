--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service'
--
INSERT INTO com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service'
--
UPDATE com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service'
--
DELETE FROM com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service WHERE 1=2;

