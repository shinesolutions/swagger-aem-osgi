--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_installer_provider_jcr_impl_jcr_installer_prop'
--
SELECT handler/schemes, sling/jcrinstall/folder/name/regexp, sling/jcrinstall/folder/max/depth, sling/jcrinstall/search/path, sling/jcrinstall/new/config/path, sling/jcrinstall/signal/path, sling/jcrinstall/enable/writeback FROM org_apache_sling_installer_provider_jcr_impl_jcr_installer_prop WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_installer_provider_jcr_impl_jcr_installer_prop'
--
INSERT INTO org_apache_sling_installer_provider_jcr_impl_jcr_installer_prop (handler/schemes, sling/jcrinstall/folder/name/regexp, sling/jcrinstall/folder/max/depth, sling/jcrinstall/search/path, sling/jcrinstall/new/config/path, sling/jcrinstall/signal/path, sling/jcrinstall/enable/writeback) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_installer_provider_jcr_impl_jcr_installer_prop'
--
UPDATE org_apache_sling_installer_provider_jcr_impl_jcr_installer_prop SET handler/schemes = ?, sling/jcrinstall/folder/name/regexp = ?, sling/jcrinstall/folder/max/depth = ?, sling/jcrinstall/search/path = ?, sling/jcrinstall/new/config/path = ?, sling/jcrinstall/signal/path = ?, sling/jcrinstall/enable/writeback = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_installer_provider_jcr_impl_jcr_installer_prop'
--
DELETE FROM org_apache_sling_installer_provider_jcr_impl_jcr_installer_prop WHERE 1=2;

