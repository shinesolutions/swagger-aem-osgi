--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingFeatureflagsFeatureProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_featureflags_feature_properties'
--
SELECT "name", description, enabled FROM org_apache_sling_featureflags_feature_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_featureflags_feature_properties'
--
INSERT INTO org_apache_sling_featureflags_feature_properties ("name", description, enabled) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_featureflags_feature_properties'
--
UPDATE org_apache_sling_featureflags_feature_properties SET "name" = ?, description = ?, enabled = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_featureflags_feature_properties'
--
DELETE FROM org_apache_sling_featureflags_feature_properties WHERE 1=2;

