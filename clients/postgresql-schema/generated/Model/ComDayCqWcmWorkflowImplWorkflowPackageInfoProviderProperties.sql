--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_workflow_impl_workflow_package_info_provider_pro'
--
SELECT workflowpackageinfoprovider/filter, workflowpackageinfoprovider/filter/rootpath FROM com_day_cq_wcm_workflow_impl_workflow_package_info_provider_pro WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_workflow_impl_workflow_package_info_provider_pro'
--
INSERT INTO com_day_cq_wcm_workflow_impl_workflow_package_info_provider_pro (workflowpackageinfoprovider/filter, workflowpackageinfoprovider/filter/rootpath) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_workflow_impl_workflow_package_info_provider_pro'
--
UPDATE com_day_cq_wcm_workflow_impl_workflow_package_info_provider_pro SET workflowpackageinfoprovider/filter = ?, workflowpackageinfoprovider/filter/rootpath = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_workflow_impl_workflow_package_info_provider_pro'
--
DELETE FROM com_day_cq_wcm_workflow_impl_workflow_package_info_provider_pro WHERE 1=2;

