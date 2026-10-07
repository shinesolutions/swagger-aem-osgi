--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingFeatureflagsImplConfiguredFeatureProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_featureflags_impl_configured_feature_propertie'
--
SELECT "name", description, enabled FROM org_apache_sling_featureflags_impl_configured_feature_propertie WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_featureflags_impl_configured_feature_propertie'
--
INSERT INTO org_apache_sling_featureflags_impl_configured_feature_propertie ("name", description, enabled) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_featureflags_impl_configured_feature_propertie'
--
UPDATE org_apache_sling_featureflags_impl_configured_feature_propertie SET "name" = ?, description = ?, enabled = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_featureflags_impl_configured_feature_propertie'
--
DELETE FROM org_apache_sling_featureflags_impl_configured_feature_propertie WHERE 1=2;

