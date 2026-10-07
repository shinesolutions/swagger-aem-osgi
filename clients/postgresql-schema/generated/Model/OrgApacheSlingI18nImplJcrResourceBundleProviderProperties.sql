--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingI18nImplJcrResourceBundleProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propert'
--
SELECT locale/default, preload/bundles, invalidation/delay FROM org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propert WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propert'
--
INSERT INTO org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propert (locale/default, preload/bundles, invalidation/delay) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propert'
--
UPDATE org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propert SET locale/default = ?, preload/bundles = ?, invalidation/delay = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propert'
--
DELETE FROM org_apache_sling_i18n_impl_jcr_resource_bundle_provider_propert WHERE 1=2;

