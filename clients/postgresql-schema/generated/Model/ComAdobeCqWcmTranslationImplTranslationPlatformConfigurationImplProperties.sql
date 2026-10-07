--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_wcm_translation_impl_translation_platform_configur'
--
SELECT sync_translation_state/scheduling_format, scheduling_repeat_translation/scheduling_format, sync_translation_state/lock_timeout_in_minutes, export/format FROM com_adobe_cq_wcm_translation_impl_translation_platform_configur WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_wcm_translation_impl_translation_platform_configur'
--
INSERT INTO com_adobe_cq_wcm_translation_impl_translation_platform_configur (sync_translation_state/scheduling_format, scheduling_repeat_translation/scheduling_format, sync_translation_state/lock_timeout_in_minutes, export/format) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_wcm_translation_impl_translation_platform_configur'
--
UPDATE com_adobe_cq_wcm_translation_impl_translation_platform_configur SET sync_translation_state/scheduling_format = ?, scheduling_repeat_translation/scheduling_format = ?, sync_translation_state/lock_timeout_in_minutes = ?, export/format = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_wcm_translation_impl_translation_platform_configur'
--
DELETE FROM com_adobe_cq_wcm_translation_impl_translation_platform_configur WHERE 1=2;

