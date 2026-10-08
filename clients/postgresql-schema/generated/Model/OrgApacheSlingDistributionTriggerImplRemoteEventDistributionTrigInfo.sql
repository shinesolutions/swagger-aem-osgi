--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_trigger_impl_remote_event_distrib'
--
SELECT pid, title, description, properties FROM org_apache_sling_distribution_trigger_impl_remote_event_distrib WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_trigger_impl_remote_event_distrib'
--
INSERT INTO org_apache_sling_distribution_trigger_impl_remote_event_distrib (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_trigger_impl_remote_event_distrib'
--
UPDATE org_apache_sling_distribution_trigger_impl_remote_event_distrib SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_trigger_impl_remote_event_distrib'
--
DELETE FROM org_apache_sling_distribution_trigger_impl_remote_event_distrib WHERE 1=2;

