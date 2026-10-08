--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_trigger_impl_jcr_event_distributi'
--
SELECT "name", "path", ignored_paths_patterns, service_name, deep FROM org_apache_sling_distribution_trigger_impl_jcr_event_distributi WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_trigger_impl_jcr_event_distributi'
--
INSERT INTO org_apache_sling_distribution_trigger_impl_jcr_event_distributi ("name", "path", ignored_paths_patterns, service_name, deep) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_trigger_impl_jcr_event_distributi'
--
UPDATE org_apache_sling_distribution_trigger_impl_jcr_event_distributi SET "name" = ?, "path" = ?, ignored_paths_patterns = ?, service_name = ?, deep = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_trigger_impl_jcr_event_distributi'
--
DELETE FROM org_apache_sling_distribution_trigger_impl_jcr_event_distributi WHERE 1=2;

