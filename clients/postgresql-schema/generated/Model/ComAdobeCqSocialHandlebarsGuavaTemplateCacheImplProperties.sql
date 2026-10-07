--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_handlebars_guava_template_cache_impl_proper'
--
SELECT parameter/guava/cache/enabled, parameter/guava/cache/params, parameter/guava/cache/reload, service/ranking FROM com_adobe_cq_social_handlebars_guava_template_cache_impl_proper WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_handlebars_guava_template_cache_impl_proper'
--
INSERT INTO com_adobe_cq_social_handlebars_guava_template_cache_impl_proper (parameter/guava/cache/enabled, parameter/guava/cache/params, parameter/guava/cache/reload, service/ranking) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_handlebars_guava_template_cache_impl_proper'
--
UPDATE com_adobe_cq_social_handlebars_guava_template_cache_impl_proper SET parameter/guava/cache/enabled = ?, parameter/guava/cache/params = ?, parameter/guava/cache/reload = ?, service/ranking = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_handlebars_guava_template_cache_impl_proper'
--
DELETE FROM com_adobe_cq_social_handlebars_guava_template_cache_impl_proper WHERE 1=2;

