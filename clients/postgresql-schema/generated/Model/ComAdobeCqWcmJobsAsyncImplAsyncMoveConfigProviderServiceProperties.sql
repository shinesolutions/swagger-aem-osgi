--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser'
--
SELECT threshold, job_topic_name, email_enabled FROM com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser'
--
INSERT INTO com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser (threshold, job_topic_name, email_enabled) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser'
--
UPDATE com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser SET threshold = ?, job_topic_name = ?, email_enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser'
--
DELETE FROM com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser WHERE 1=2;

