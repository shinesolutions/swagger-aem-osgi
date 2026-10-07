--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_workflow_impl_workflow_package_info_provider_inf'
--
SELECT pid, title, description, properties FROM com_day_cq_wcm_workflow_impl_workflow_package_info_provider_inf WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_workflow_impl_workflow_package_info_provider_inf'
--
INSERT INTO com_day_cq_wcm_workflow_impl_workflow_package_info_provider_inf (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_wcm_workflow_impl_workflow_package_info_provider_inf'
--
UPDATE com_day_cq_wcm_workflow_impl_workflow_package_info_provider_inf SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_workflow_impl_workflow_package_info_provider_inf'
--
DELETE FROM com_day_cq_wcm_workflow_impl_workflow_package_info_provider_inf WHERE 1=2;

