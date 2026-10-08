--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionSerializationImplDistributionPackageBuInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_serialization_impl_distribution_p'
--
SELECT pid, title, description, properties FROM org_apache_sling_distribution_serialization_impl_distribution_p WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_serialization_impl_distribution_p'
--
INSERT INTO org_apache_sling_distribution_serialization_impl_distribution_p (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_serialization_impl_distribution_p'
--
UPDATE org_apache_sling_distribution_serialization_impl_distribution_p SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_serialization_impl_distribution_p'
--
DELETE FROM org_apache_sling_distribution_serialization_impl_distribution_p WHERE 1=2;

