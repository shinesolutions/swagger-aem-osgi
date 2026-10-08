--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_trigger_impl_distribution_event_d'
--
SELECT "name", "path" FROM org_apache_sling_distribution_trigger_impl_distribution_event_d WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_trigger_impl_distribution_event_d'
--
INSERT INTO org_apache_sling_distribution_trigger_impl_distribution_event_d ("name", "path") VALUES (?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_trigger_impl_distribution_event_d'
--
UPDATE org_apache_sling_distribution_trigger_impl_distribution_event_d SET "name" = ?, "path" = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_trigger_impl_distribution_event_d'
--
DELETE FROM org_apache_sling_distribution_trigger_impl_distribution_event_d WHERE 1=2;

