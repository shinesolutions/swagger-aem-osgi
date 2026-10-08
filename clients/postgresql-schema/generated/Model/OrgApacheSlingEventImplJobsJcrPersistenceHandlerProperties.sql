--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_event_impl_jobs_jcr_persistence_handler_proper'
--
SELECT job/consumermanager/disable_distribution, startup/delay, cleanup/period FROM org_apache_sling_event_impl_jobs_jcr_persistence_handler_proper WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_event_impl_jobs_jcr_persistence_handler_proper'
--
INSERT INTO org_apache_sling_event_impl_jobs_jcr_persistence_handler_proper (job/consumermanager/disable_distribution, startup/delay, cleanup/period) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_event_impl_jobs_jcr_persistence_handler_proper'
--
UPDATE org_apache_sling_event_impl_jobs_jcr_persistence_handler_proper SET job/consumermanager/disable_distribution = ?, startup/delay = ?, cleanup/period = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_event_impl_jobs_jcr_persistence_handler_proper'
--
DELETE FROM org_apache_sling_event_impl_jobs_jcr_persistence_handler_proper WHERE 1=2;

