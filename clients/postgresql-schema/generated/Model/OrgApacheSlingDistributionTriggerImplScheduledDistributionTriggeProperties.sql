--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_trigger_impl_scheduled_distributi'
--
SELECT "name", "path", seconds, service_name FROM org_apache_sling_distribution_trigger_impl_scheduled_distributi WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_trigger_impl_scheduled_distributi'
--
INSERT INTO org_apache_sling_distribution_trigger_impl_scheduled_distributi ("name", "path", seconds, service_name) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_trigger_impl_scheduled_distributi'
--
UPDATE org_apache_sling_distribution_trigger_impl_scheduled_distributi SET "name" = ?, "path" = ?, seconds = ?, service_name = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_trigger_impl_scheduled_distributi'
--
DELETE FROM org_apache_sling_distribution_trigger_impl_scheduled_distributi WHERE 1=2;

