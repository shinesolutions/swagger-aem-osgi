--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingEventJobsQueueConfigurationProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_event_jobs_queue_configuration_properties'
--
SELECT queue/name, queue/topics, queue/type, queue/priority, queue/retries, queue/retrydelay, queue/maxparallel, queue/keep_jobs, queue/prefer_run_on_creation_instance, queue/thread_pool_size, service/ranking FROM org_apache_sling_event_jobs_queue_configuration_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_event_jobs_queue_configuration_properties'
--
INSERT INTO org_apache_sling_event_jobs_queue_configuration_properties (queue/name, queue/topics, queue/type, queue/priority, queue/retries, queue/retrydelay, queue/maxparallel, queue/keep_jobs, queue/prefer_run_on_creation_instance, queue/thread_pool_size, service/ranking) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_event_jobs_queue_configuration_properties'
--
UPDATE org_apache_sling_event_jobs_queue_configuration_properties SET queue/name = ?, queue/topics = ?, queue/type = ?, queue/priority = ?, queue/retries = ?, queue/retrydelay = ?, queue/maxparallel = ?, queue/keep_jobs = ?, queue/prefer_run_on_creation_instance = ?, queue/thread_pool_size = ?, service/ranking = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_event_jobs_queue_configuration_properties'
--
DELETE FROM org_apache_sling_event_jobs_queue_configuration_properties WHERE 1=2;

