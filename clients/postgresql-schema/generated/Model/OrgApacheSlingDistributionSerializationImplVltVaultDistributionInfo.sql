--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionSerializationImplVltVaultDistributionInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_serialization_impl_vlt_vault_dist'
--
SELECT pid, title, description, properties FROM org_apache_sling_distribution_serialization_impl_vlt_vault_dist WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_serialization_impl_vlt_vault_dist'
--
INSERT INTO org_apache_sling_distribution_serialization_impl_vlt_vault_dist (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_serialization_impl_vlt_vault_dist'
--
UPDATE org_apache_sling_distribution_serialization_impl_vlt_vault_dist SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_serialization_impl_vlt_vault_dist'
--
DELETE FROM org_apache_sling_distribution_serialization_impl_vlt_vault_dist WHERE 1=2;

