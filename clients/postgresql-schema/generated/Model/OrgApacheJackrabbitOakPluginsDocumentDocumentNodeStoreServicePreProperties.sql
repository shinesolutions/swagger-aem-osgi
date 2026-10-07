--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_document_document_node_store_'
--
SELECT persistent_cache_includes FROM org_apache_jackrabbit_oak_plugins_document_document_node_store_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_document_document_node_store_'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_document_document_node_store_ (persistent_cache_includes) VALUES (?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_document_document_node_store_'
--
UPDATE org_apache_jackrabbit_oak_plugins_document_document_node_store_ SET persistent_cache_includes = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_document_document_node_store_'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_document_document_node_store_ WHERE 1=2;

