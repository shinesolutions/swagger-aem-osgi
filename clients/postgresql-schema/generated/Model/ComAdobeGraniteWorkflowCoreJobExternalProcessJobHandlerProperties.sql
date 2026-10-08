--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_core_job_external_process_job_handle'
--
SELECT default/timeout, max/timeout, default/period FROM com_adobe_granite_workflow_core_job_external_process_job_handle WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_core_job_external_process_job_handle'
--
INSERT INTO com_adobe_granite_workflow_core_job_external_process_job_handle (default/timeout, max/timeout, default/period) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_core_job_external_process_job_handle'
--
UPDATE com_adobe_granite_workflow_core_job_external_process_job_handle SET default/timeout = ?, max/timeout = ?, default/period = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_core_job_external_process_job_handle'
--
DELETE FROM com_adobe_granite_workflow_core_job_external_process_job_handle WHERE 1=2;

