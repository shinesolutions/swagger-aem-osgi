--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_'
--
SELECT home_path FROM org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_'
--
INSERT INTO org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_ (home_path) VALUES (?);

--
-- UPDATE template for table 'org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_'
--
UPDATE org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_ SET home_path = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_'
--
DELETE FROM org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_ WHERE 1=2;

