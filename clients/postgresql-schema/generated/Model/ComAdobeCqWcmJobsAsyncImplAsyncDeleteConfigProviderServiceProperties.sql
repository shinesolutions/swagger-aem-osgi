--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_s'
--
SELECT threshold, job_topic_name, email_enabled FROM com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_s WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_s'
--
INSERT INTO com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_s (threshold, job_topic_name, email_enabled) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_s'
--
UPDATE com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_s SET threshold = ?, job_topic_name = ?, email_enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_s'
--
DELETE FROM com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_s WHERE 1=2;

