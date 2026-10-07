--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_segment_azure_azure_segment_store_ser'
--
SELECT account_name, container_name, access_key, root_path, connection_url FROM org_apache_jackrabbit_oak_segment_azure_azure_segment_store_ser WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_segment_azure_azure_segment_store_ser'
--
INSERT INTO org_apache_jackrabbit_oak_segment_azure_azure_segment_store_ser (account_name, container_name, access_key, root_path, connection_url) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_segment_azure_azure_segment_store_ser'
--
UPDATE org_apache_jackrabbit_oak_segment_azure_azure_segment_store_ser SET account_name = ?, container_name = ?, access_key = ?, root_path = ?, connection_url = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_segment_azure_azure_segment_store_ser'
--
DELETE FROM org_apache_jackrabbit_oak_segment_azure_azure_segment_store_ser WHERE 1=2;

