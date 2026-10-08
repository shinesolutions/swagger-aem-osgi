--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properti'
--
SELECT event/filter, min_thread_pool_size, max_thread_pool_size, cq/wcm/workflow/terminate/on/activate, cq/wcm/worklfow/terminate/exclusion/list FROM com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properti WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properti'
--
INSERT INTO com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properti (event/filter, min_thread_pool_size, max_thread_pool_size, cq/wcm/workflow/terminate/on/activate, cq/wcm/worklfow/terminate/exclusion/list) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properti'
--
UPDATE com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properti SET event/filter = ?, min_thread_pool_size = ?, max_thread_pool_size = ?, cq/wcm/workflow/terminate/on/activate = ?, cq/wcm/worklfow/terminate/exclusion/list = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properti'
--
DELETE FROM com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_properti WHERE 1=2;

