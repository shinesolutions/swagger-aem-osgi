--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreWorkflowConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_core_workflow_config_properties'
--
SELECT cq/workflow/config/workflow/packages/root/path, cq/workflow/config/workflow/process/legacy/mode, cq/workflow/config/allow/locking FROM com_adobe_granite_workflow_core_workflow_config_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_core_workflow_config_properties'
--
INSERT INTO com_adobe_granite_workflow_core_workflow_config_properties (cq/workflow/config/workflow/packages/root/path, cq/workflow/config/workflow/process/legacy/mode, cq/workflow/config/allow/locking) VALUES (?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_core_workflow_config_properties'
--
UPDATE com_adobe_granite_workflow_core_workflow_config_properties SET cq/workflow/config/workflow/packages/root/path = ?, cq/workflow/config/workflow/process/legacy/mode = ?, cq/workflow/config/allow/locking = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_core_workflow_config_properties'
--
DELETE FROM com_adobe_granite_workflow_core_workflow_config_properties WHERE 1=2;

