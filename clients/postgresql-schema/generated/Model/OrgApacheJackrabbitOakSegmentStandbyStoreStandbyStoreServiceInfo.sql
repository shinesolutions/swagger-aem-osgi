--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_segment_standby_store_standby_store_s'
--
SELECT pid, title, description, properties FROM org_apache_jackrabbit_oak_segment_standby_store_standby_store_s WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_segment_standby_store_standby_store_s'
--
INSERT INTO org_apache_jackrabbit_oak_segment_standby_store_standby_store_s (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_segment_standby_store_standby_store_s'
--
UPDATE org_apache_jackrabbit_oak_segment_standby_store_standby_store_s SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_segment_standby_store_standby_store_s'
--
DELETE FROM org_apache_jackrabbit_oak_segment_standby_store_standby_store_s WHERE 1=2;

