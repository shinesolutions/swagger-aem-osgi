--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_packaging_impl_exporter_local_dis'
--
SELECT "name", package_builder/target FROM org_apache_sling_distribution_packaging_impl_exporter_local_dis WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_packaging_impl_exporter_local_dis'
--
INSERT INTO org_apache_sling_distribution_packaging_impl_exporter_local_dis ("name", package_builder/target) VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_packaging_impl_exporter_local_dis'
--
UPDATE org_apache_sling_distribution_packaging_impl_exporter_local_dis SET "name" = ?, package_builder/target = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_packaging_impl_exporter_local_dis'
--
DELETE FROM org_apache_sling_distribution_packaging_impl_exporter_local_dis WHERE 1=2;

