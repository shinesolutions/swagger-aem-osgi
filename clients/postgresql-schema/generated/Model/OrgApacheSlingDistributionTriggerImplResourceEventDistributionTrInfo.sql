--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_trigger_impl_resource_event_distr'
--
SELECT pid, title, description, properties FROM org_apache_sling_distribution_trigger_impl_resource_event_distr WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_trigger_impl_resource_event_distr'
--
INSERT INTO org_apache_sling_distribution_trigger_impl_resource_event_distr (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_trigger_impl_resource_event_distr'
--
UPDATE org_apache_sling_distribution_trigger_impl_resource_event_distr SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_trigger_impl_resource_event_distr'
--
DELETE FROM org_apache_sling_distribution_trigger_impl_resource_event_distr WHERE 1=2;

