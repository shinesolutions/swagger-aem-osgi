--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_core_offloading_workflow_offloading_'
--
SELECT pid, title, description, properties FROM com_adobe_granite_workflow_core_offloading_workflow_offloading_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_core_offloading_workflow_offloading_'
--
INSERT INTO com_adobe_granite_workflow_core_offloading_workflow_offloading_ (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_core_offloading_workflow_offloading_'
--
UPDATE com_adobe_granite_workflow_core_offloading_workflow_offloading_ SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_core_offloading_workflow_offloading_'
--
DELETE FROM com_adobe_granite_workflow_core_offloading_workflow_offloading_ WHERE 1=2;

