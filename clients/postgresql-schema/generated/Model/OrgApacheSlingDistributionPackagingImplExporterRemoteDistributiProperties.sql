--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_packaging_impl_exporter_remote_di'
--
SELECT "name", endpoints, pull/items, package_builder/target, transport_secret_provider/target FROM org_apache_sling_distribution_packaging_impl_exporter_remote_di WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_packaging_impl_exporter_remote_di'
--
INSERT INTO org_apache_sling_distribution_packaging_impl_exporter_remote_di ("name", endpoints, pull/items, package_builder/target, transport_secret_provider/target) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_packaging_impl_exporter_remote_di'
--
UPDATE org_apache_sling_distribution_packaging_impl_exporter_remote_di SET "name" = ?, endpoints = ?, pull/items = ?, package_builder/target = ?, transport_secret_provider/target = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_packaging_impl_exporter_remote_di'
--
DELETE FROM org_apache_sling_distribution_packaging_impl_exporter_remote_di WHERE 1=2;

