--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro'
--
SELECT pid, title, description, properties, additional_properties, bundle_location, service_location FROM org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro (pid, title, description, properties, additional_properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro'
--
UPDATE org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro SET pid = ?, title = ?, description = ?, properties = ?, additional_properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_pro WHERE 1=2;

