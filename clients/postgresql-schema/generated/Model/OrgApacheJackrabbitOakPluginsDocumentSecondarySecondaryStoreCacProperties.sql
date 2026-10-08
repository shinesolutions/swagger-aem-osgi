--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_document_secondary_secondary_'
--
SELECT included_paths, enable_async_observer, observer_queue_size FROM org_apache_jackrabbit_oak_plugins_document_secondary_secondary_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_document_secondary_secondary_'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_document_secondary_secondary_ (included_paths, enable_async_observer, observer_queue_size) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_document_secondary_secondary_'
--
UPDATE org_apache_jackrabbit_oak_plugins_document_secondary_secondary_ SET included_paths = ?, enable_async_observer = ?, observer_queue_size = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_document_secondary_secondary_'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_document_secondary_secondary_ WHERE 1=2;

