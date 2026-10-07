--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_extensions_webconsolesecurityprovider_internal'
--
SELECT users, "groups" FROM org_apache_sling_extensions_webconsolesecurityprovider_internal WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_extensions_webconsolesecurityprovider_internal'
--
INSERT INTO org_apache_sling_extensions_webconsolesecurityprovider_internal (users, "groups") VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_extensions_webconsolesecurityprovider_internal'
--
UPDATE org_apache_sling_extensions_webconsolesecurityprovider_internal SET users = ?, "groups" = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_extensions_webconsolesecurityprovider_internal'
--
DELETE FROM org_apache_sling_extensions_webconsolesecurityprovider_internal WHERE 1=2;

