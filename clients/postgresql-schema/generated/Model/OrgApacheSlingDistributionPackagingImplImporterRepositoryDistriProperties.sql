--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_packaging_impl_importer_repositor'
--
SELECT "name", service/name, "path", privilege/name FROM org_apache_sling_distribution_packaging_impl_importer_repositor WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_packaging_impl_importer_repositor'
--
INSERT INTO org_apache_sling_distribution_packaging_impl_importer_repositor ("name", service/name, "path", privilege/name) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_packaging_impl_importer_repositor'
--
UPDATE org_apache_sling_distribution_packaging_impl_importer_repositor SET "name" = ?, service/name = ?, "path" = ?, privilege/name = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_packaging_impl_importer_repositor'
--
DELETE FROM org_apache_sling_distribution_packaging_impl_importer_repositor WHERE 1=2;

