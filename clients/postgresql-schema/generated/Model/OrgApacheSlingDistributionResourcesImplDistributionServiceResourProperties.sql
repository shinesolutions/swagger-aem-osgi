--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_resources_impl_distribution_servi'
--
SELECT provider/roots, kind FROM org_apache_sling_distribution_resources_impl_distribution_servi WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_resources_impl_distribution_servi'
--
INSERT INTO org_apache_sling_distribution_resources_impl_distribution_servi (provider/roots, kind) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_resources_impl_distribution_servi'
--
UPDATE org_apache_sling_distribution_resources_impl_distribution_servi SET provider/roots = ?, kind = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_resources_impl_distribution_servi'
--
DELETE FROM org_apache_sling_distribution_resources_impl_distribution_servi WHERE 1=2;

