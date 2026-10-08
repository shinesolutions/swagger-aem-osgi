--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_commons_comments_endpoints_impl_translation'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_commons_comments_endpoints_impl_translation WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_commons_comments_endpoints_impl_translation'
--
INSERT INTO com_adobe_cq_social_commons_comments_endpoints_impl_translation (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_commons_comments_endpoints_impl_translation'
--
UPDATE com_adobe_cq_social_commons_comments_endpoints_impl_translation SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_commons_comments_endpoints_impl_translation'
--
DELETE FROM com_adobe_cq_social_commons_comments_endpoints_impl_translation WHERE 1=2;

