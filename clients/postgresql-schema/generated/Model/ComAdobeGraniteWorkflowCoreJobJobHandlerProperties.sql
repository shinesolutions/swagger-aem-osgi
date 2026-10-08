--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreJobJobHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_core_job_job_handler_properties'
--
SELECT job/topics, allow/self/process/termination FROM com_adobe_granite_workflow_core_job_job_handler_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_core_job_job_handler_properties'
--
INSERT INTO com_adobe_granite_workflow_core_job_job_handler_properties (job/topics, allow/self/process/termination) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_core_job_job_handler_properties'
--
UPDATE com_adobe_granite_workflow_core_job_job_handler_properties SET job/topics = ?, allow/self/process/termination = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_core_job_job_handler_properties'
--
DELETE FROM com_adobe_granite_workflow_core_job_job_handler_properties WHERE 1=2;

