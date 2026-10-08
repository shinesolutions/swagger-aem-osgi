--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_trigger_impl_resource_event_distr'
--
SELECT "name", "path" FROM org_apache_sling_distribution_trigger_impl_resource_event_distr WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_trigger_impl_resource_event_distr'
--
INSERT INTO org_apache_sling_distribution_trigger_impl_resource_event_distr ("name", "path") VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_trigger_impl_resource_event_distr'
--
UPDATE org_apache_sling_distribution_trigger_impl_resource_event_distr SET "name" = ?, "path" = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_trigger_impl_resource_event_distr'
--
DELETE FROM org_apache_sling_distribution_trigger_impl_resource_event_distr WHERE 1=2;

