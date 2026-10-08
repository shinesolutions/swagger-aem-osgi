--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_translation_impl_translation_service_config'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_translation_impl_translation_service_config WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_translation_impl_translation_service_config'
--
INSERT INTO com_adobe_cq_social_translation_impl_translation_service_config (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_translation_impl_translation_service_config'
--
UPDATE com_adobe_cq_social_translation_impl_translation_service_config SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_translation_impl_translation_service_config'
--
DELETE FROM com_adobe_cq_social_translation_impl_translation_service_config WHERE 1=2;

