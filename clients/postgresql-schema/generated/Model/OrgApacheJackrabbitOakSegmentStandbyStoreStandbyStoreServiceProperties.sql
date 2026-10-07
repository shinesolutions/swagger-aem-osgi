--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_jackrabbit_oak_segment_standby_store_standby_store_s'
--
SELECT org/apache/sling/installer/configuration/persist, "mode", port, primary/host, "interval", primary/allowed_client_ip_ranges, secure, standby/readtimeout, standby/autoclean FROM org_apache_jackrabbit_oak_segment_standby_store_standby_store_s WHERE 1=1;

--
-- INSERT template for table 'org_apache_jackrabbit_oak_segment_standby_store_standby_store_s'
--
INSERT INTO org_apache_jackrabbit_oak_segment_standby_store_standby_store_s (org/apache/sling/installer/configuration/persist, "mode", port, primary/host, "interval", primary/allowed_client_ip_ranges, secure, standby/readtimeout, standby/autoclean) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_jackrabbit_oak_segment_standby_store_standby_store_s'
--
UPDATE org_apache_jackrabbit_oak_segment_standby_store_standby_store_s SET org/apache/sling/installer/configuration/persist = ?, "mode" = ?, port = ?, primary/host = ?, "interval" = ?, primary/allowed_client_ip_ranges = ?, secure = ?, standby/readtimeout = ?, standby/autoclean = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_jackrabbit_oak_segment_standby_store_standby_store_s'
--
DELETE FROM org_apache_jackrabbit_oak_segment_standby_store_standby_store_s WHERE 1=2;

