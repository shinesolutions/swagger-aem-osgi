--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionResourcesImplDistributionConfigurationInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_resources_impl_distribution_confi'
--
SELECT pid, title, description, properties FROM org_apache_sling_distribution_resources_impl_distribution_confi WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_resources_impl_distribution_confi'
--
INSERT INTO org_apache_sling_distribution_resources_impl_distribution_confi (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_resources_impl_distribution_confi'
--
UPDATE org_apache_sling_distribution_resources_impl_distribution_confi SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_resources_impl_distribution_confi'
--
DELETE FROM org_apache_sling_distribution_resources_impl_distribution_confi WHERE 1=2;

