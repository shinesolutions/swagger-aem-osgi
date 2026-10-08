--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_service_in'
--
SELECT pid, title, description, properties, additional_properties, bundle_location, service_location FROM org_apache_jackrabbit_oak_segment_segment_node_store_service_in WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_service_in'
--
INSERT INTO org_apache_jackrabbit_oak_segment_segment_node_store_service_in (pid, title, description, properties, additional_properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_service_in'
--
UPDATE org_apache_jackrabbit_oak_segment_segment_node_store_service_in SET pid = ?, title = ?, description = ?, properties = ?, additional_properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_segment_segment_node_store_service_in'
--
DELETE FROM org_apache_jackrabbit_oak_segment_segment_node_store_service_in WHERE 1=2;

