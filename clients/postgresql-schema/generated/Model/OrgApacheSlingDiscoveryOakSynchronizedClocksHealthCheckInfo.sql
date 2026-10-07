--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_discovery_oak_synchronized_clocks_health_check'
--
SELECT pid, title, description, properties FROM org_apache_sling_discovery_oak_synchronized_clocks_health_check WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_discovery_oak_synchronized_clocks_health_check'
--
INSERT INTO org_apache_sling_discovery_oak_synchronized_clocks_health_check (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_discovery_oak_synchronized_clocks_health_check'
--
UPDATE org_apache_sling_discovery_oak_synchronized_clocks_health_check SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_discovery_oak_synchronized_clocks_health_check'
--
DELETE FROM org_apache_sling_discovery_oak_synchronized_clocks_health_check WHERE 1=2;

