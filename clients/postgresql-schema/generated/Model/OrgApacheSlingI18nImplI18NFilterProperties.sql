--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingI18nImplI18NFilterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_i18n_impl_i18_n_filter_properties'
--
SELECT service/ranking, sling/filter/scope FROM org_apache_sling_i18n_impl_i18_n_filter_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_i18n_impl_i18_n_filter_properties'
--
INSERT INTO org_apache_sling_i18n_impl_i18_n_filter_properties (service/ranking, sling/filter/scope) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_i18n_impl_i18_n_filter_properties'
--
UPDATE org_apache_sling_i18n_impl_i18_n_filter_properties SET service/ranking = ?, sling/filter/scope = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_i18n_impl_i18_n_filter_properties'
--
DELETE FROM org_apache_sling_i18n_impl_i18_n_filter_properties WHERE 1=2;

