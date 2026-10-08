--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_distribution_trigger_impl_persisted_jcr_event_'
--
SELECT "name", "path", service_name, nuggets_path FROM org_apache_sling_distribution_trigger_impl_persisted_jcr_event_ WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_distribution_trigger_impl_persisted_jcr_event_'
--
INSERT INTO org_apache_sling_distribution_trigger_impl_persisted_jcr_event_ ("name", "path", service_name, nuggets_path) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_distribution_trigger_impl_persisted_jcr_event_'
--
UPDATE org_apache_sling_distribution_trigger_impl_persisted_jcr_event_ SET "name" = ?, "path" = ?, service_name = ?, nuggets_path = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_distribution_trigger_impl_persisted_jcr_event_'
--
DELETE FROM org_apache_sling_distribution_trigger_impl_persisted_jcr_event_ WHERE 1=2;

