--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_extensions_webconsolesecurityprovider_internal'
--
SELECT pid, title, description, properties FROM org_apache_sling_extensions_webconsolesecurityprovider_internal WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_extensions_webconsolesecurityprovider_internal'
--
INSERT INTO org_apache_sling_extensions_webconsolesecurityprovider_internal (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_extensions_webconsolesecurityprovider_internal'
--
UPDATE org_apache_sling_extensions_webconsolesecurityprovider_internal SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_extensions_webconsolesecurityprovider_internal'
--
DELETE FROM org_apache_sling_extensions_webconsolesecurityprovider_internal WHERE 1=2;

