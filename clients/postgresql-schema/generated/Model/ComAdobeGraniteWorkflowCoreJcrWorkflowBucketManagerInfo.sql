--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_inf'
--
SELECT pid, title, description, properties FROM com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_inf WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_inf'
--
INSERT INTO com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_inf (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_inf'
--
UPDATE com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_inf SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_inf'
--
DELETE FROM com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_inf WHERE 1=2;

