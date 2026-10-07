--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_trigger_impl_distribution_event_d'
--
SELECT pid, title, description, properties FROM org_apache_sling_distribution_trigger_impl_distribution_event_d WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_trigger_impl_distribution_event_d'
--
INSERT INTO org_apache_sling_distribution_trigger_impl_distribution_event_d (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_trigger_impl_distribution_event_d'
--
UPDATE org_apache_sling_distribution_trigger_impl_distribution_event_d SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_trigger_impl_distribution_event_d'
--
DELETE FROM org_apache_sling_distribution_trigger_impl_distribution_event_d WHERE 1=2;

