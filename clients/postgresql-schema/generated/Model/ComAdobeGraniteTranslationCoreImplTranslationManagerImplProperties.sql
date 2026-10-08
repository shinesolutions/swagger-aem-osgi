--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_translation_core_impl_translation_manager_imp'
--
SELECT default_connector_name, default_category FROM com_adobe_granite_translation_core_impl_translation_manager_imp WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_translation_core_impl_translation_manager_imp'
--
INSERT INTO com_adobe_granite_translation_core_impl_translation_manager_imp (default_connector_name, default_category) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_translation_core_impl_translation_manager_imp'
--
UPDATE com_adobe_granite_translation_core_impl_translation_manager_imp SET default_connector_name = ?, default_category = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_translation_core_impl_translation_manager_imp'
--
DELETE FROM com_adobe_granite_translation_core_impl_translation_manager_imp WHERE 1=2;

