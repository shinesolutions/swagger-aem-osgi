--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_core_job_external_process_job_handle'
--
SELECT pid, title, description, properties FROM com_adobe_granite_workflow_core_job_external_process_job_handle WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_core_job_external_process_job_handle'
--
INSERT INTO com_adobe_granite_workflow_core_job_external_process_job_handle (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_core_job_external_process_job_handle'
--
UPDATE com_adobe_granite_workflow_core_job_external_process_job_handle SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_core_job_external_process_job_handle'
--
DELETE FROM com_adobe_granite_workflow_core_job_external_process_job_handle WHERE 1=2;

