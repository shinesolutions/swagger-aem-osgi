--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_monitor_distribution_queue_health'
--
SELECT pid, title, description, properties FROM org_apache_sling_distribution_monitor_distribution_queue_health WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_monitor_distribution_queue_health'
--
INSERT INTO org_apache_sling_distribution_monitor_distribution_queue_health (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_monitor_distribution_queue_health'
--
UPDATE org_apache_sling_distribution_monitor_distribution_queue_health SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_monitor_distribution_queue_health'
--
DELETE FROM org_apache_sling_distribution_monitor_distribution_queue_health WHERE 1=2;

