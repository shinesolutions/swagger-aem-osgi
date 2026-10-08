--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_proper'
--
SELECT scheduler/expression, job/purge/threshold, job/purge/max/jobs FROM com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_proper WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_proper'
--
INSERT INTO com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_proper (scheduler/expression, job/purge/threshold, job/purge/max/jobs) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_proper'
--
UPDATE com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_proper SET scheduler/expression = ?, job/purge/threshold = ?, job/purge/max/jobs = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_proper'
--
DELETE FROM com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_proper WHERE 1=2;

