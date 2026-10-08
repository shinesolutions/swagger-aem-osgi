--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEventImplJobsDefaultJobManagerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_event_impl_jobs_default_job_manager_properties'
--
SELECT queue/priority, queue/retries, queue/retrydelay, queue/maxparallel FROM org_apache_sling_event_impl_jobs_default_job_manager_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_event_impl_jobs_default_job_manager_properties'
--
INSERT INTO org_apache_sling_event_impl_jobs_default_job_manager_properties (queue/priority, queue/retries, queue/retrydelay, queue/maxparallel) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_event_impl_jobs_default_job_manager_properties'
--
UPDATE org_apache_sling_event_impl_jobs_default_job_manager_properties SET queue/priority = ?, queue/retries = ?, queue/retrydelay = ?, queue/maxparallel = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_event_impl_jobs_default_job_manager_properties'
--
DELETE FROM org_apache_sling_event_impl_jobs_default_job_manager_properties WHERE 1=2;

