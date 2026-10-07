--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_trigger_impl_remote_event_distrib'
--
SELECT "name", endpoint, transport_secret_provider/target FROM org_apache_sling_distribution_trigger_impl_remote_event_distrib WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_trigger_impl_remote_event_distrib'
--
INSERT INTO org_apache_sling_distribution_trigger_impl_remote_event_distrib ("name", endpoint, transport_secret_provider/target) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_trigger_impl_remote_event_distrib'
--
UPDATE org_apache_sling_distribution_trigger_impl_remote_event_distrib SET "name" = ?, endpoint = ?, transport_secret_provider/target = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_trigger_impl_remote_event_distrib'
--
DELETE FROM org_apache_sling_distribution_trigger_impl_remote_event_distrib WHERE 1=2;

