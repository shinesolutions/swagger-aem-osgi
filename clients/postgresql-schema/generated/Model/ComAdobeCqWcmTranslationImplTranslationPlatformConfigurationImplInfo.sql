--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_wcm_translation_impl_translation_platform_configur'
--
SELECT pid, title, description, properties FROM com_adobe_cq_wcm_translation_impl_translation_platform_configur WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_wcm_translation_impl_translation_platform_configur'
--
INSERT INTO com_adobe_cq_wcm_translation_impl_translation_platform_configur (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_wcm_translation_impl_translation_platform_configur'
--
UPDATE com_adobe_cq_wcm_translation_impl_translation_platform_configur SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_wcm_translation_impl_translation_platform_configur'
--
DELETE FROM com_adobe_cq_wcm_translation_impl_translation_platform_configur WHERE 1=2;

