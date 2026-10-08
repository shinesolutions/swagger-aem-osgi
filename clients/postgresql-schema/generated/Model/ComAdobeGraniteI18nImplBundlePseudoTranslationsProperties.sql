--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteI18nImplBundlePseudoTranslationsProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_i18n_impl_bundle_pseudo_translations_properti'
--
SELECT pseudo/patterns FROM com_adobe_granite_i18n_impl_bundle_pseudo_translations_properti WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_i18n_impl_bundle_pseudo_translations_properti'
--
INSERT INTO com_adobe_granite_i18n_impl_bundle_pseudo_translations_properti (pseudo/patterns) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_i18n_impl_bundle_pseudo_translations_properti'
--
UPDATE com_adobe_granite_i18n_impl_bundle_pseudo_translations_properti SET pseudo/patterns = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_i18n_impl_bundle_pseudo_translations_properti'
--
DELETE FROM com_adobe_granite_i18n_impl_bundle_pseudo_translations_properti WHERE 1=2;

