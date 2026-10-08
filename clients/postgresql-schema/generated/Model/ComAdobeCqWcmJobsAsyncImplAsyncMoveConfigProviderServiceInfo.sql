--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser'
--
SELECT pid, title, description, properties FROM com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser'
--
INSERT INTO com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser'
--
UPDATE com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser'
--
DELETE FROM com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_ser WHERE 1=2;

