--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_monitor_distribution_queue_health'
--
SELECT hc/name, hc/tags, hc/mbean/name, number_of_retries_allowed FROM org_apache_sling_distribution_monitor_distribution_queue_health WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_monitor_distribution_queue_health'
--
INSERT INTO org_apache_sling_distribution_monitor_distribution_queue_health (hc/name, hc/tags, hc/mbean/name, number_of_retries_allowed) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_monitor_distribution_queue_health'
--
UPDATE org_apache_sling_distribution_monitor_distribution_queue_health SET hc/name = ?, hc/tags = ?, hc/mbean/name = ?, number_of_retries_allowed = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_monitor_distribution_queue_health'
--
DELETE FROM org_apache_sling_distribution_monitor_distribution_queue_health WHERE 1=2;

