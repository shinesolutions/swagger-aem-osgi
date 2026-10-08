--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_translation_impl_ugc_language_detector_prop'
--
SELECT event/topics, event/filter, translate/listener/type, translate/property/list, pool_size, max_pool_size, queue_size, keep_alive_time FROM com_adobe_cq_social_translation_impl_ugc_language_detector_prop WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_translation_impl_ugc_language_detector_prop'
--
INSERT INTO com_adobe_cq_social_translation_impl_ugc_language_detector_prop (event/topics, event/filter, translate/listener/type, translate/property/list, pool_size, max_pool_size, queue_size, keep_alive_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_translation_impl_ugc_language_detector_prop'
--
UPDATE com_adobe_cq_social_translation_impl_ugc_language_detector_prop SET event/topics = ?, event/filter = ?, translate/listener/type = ?, translate/property/list = ?, pool_size = ?, max_pool_size = ?, queue_size = ?, keep_alive_time = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_translation_impl_ugc_language_detector_prop'
--
DELETE FROM com_adobe_cq_social_translation_impl_ugc_language_detector_prop WHERE 1=2;

