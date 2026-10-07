--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEventImplJobsJobConsumerManagerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_event_impl_jobs_job_consumer_manager_propertie'
--
SELECT org/apache/sling/installer/configuration/persist, job/consumermanager/whitelist, job/consumermanager/blacklist FROM org_apache_sling_event_impl_jobs_job_consumer_manager_propertie WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_event_impl_jobs_job_consumer_manager_propertie'
--
INSERT INTO org_apache_sling_event_impl_jobs_job_consumer_manager_propertie (org/apache/sling/installer/configuration/persist, job/consumermanager/whitelist, job/consumermanager/blacklist) VALUES (?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_event_impl_jobs_job_consumer_manager_propertie'
--
UPDATE org_apache_sling_event_impl_jobs_job_consumer_manager_propertie SET org/apache/sling/installer/configuration/persist = ?, job/consumermanager/whitelist = ?, job/consumermanager/blacklist = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_event_impl_jobs_job_consumer_manager_propertie'
--
DELETE FROM org_apache_sling_event_impl_jobs_job_consumer_manager_propertie WHERE 1=2;

