--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provide'
--
SELECT pid, title, description, properties FROM com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provide WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provide'
--
INSERT INTO com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provide (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provide'
--
UPDATE com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provide SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provide'
--
DELETE FROM com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provide WHERE 1=2;

