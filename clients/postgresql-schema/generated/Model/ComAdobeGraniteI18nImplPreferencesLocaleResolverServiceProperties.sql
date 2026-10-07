--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_i18n_impl_preferences_locale_resolver_service'
--
SELECT security/preferences/name FROM com_adobe_granite_i18n_impl_preferences_locale_resolver_service WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_i18n_impl_preferences_locale_resolver_service'
--
INSERT INTO com_adobe_granite_i18n_impl_preferences_locale_resolver_service (security/preferences/name) VALUES (?);

--
-- UPDATE template for table 'com_adobe_granite_i18n_impl_preferences_locale_resolver_service'
--
UPDATE com_adobe_granite_i18n_impl_preferences_locale_resolver_service SET security/preferences/name = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_i18n_impl_preferences_locale_resolver_service'
--
DELETE FROM com_adobe_granite_i18n_impl_preferences_locale_resolver_service WHERE 1=2;

