--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_stor'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_stor WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_stor'
--
INSERT INTO org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_stor (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_stor'
--
UPDATE org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_stor SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_stor'
--
DELETE FROM org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_stor WHERE 1=2;

