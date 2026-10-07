--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_console_publish_workflow_publish_eve'
--
SELECT pid, title, description, properties FROM com_adobe_granite_workflow_console_publish_workflow_publish_eve WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_console_publish_workflow_publish_eve'
--
INSERT INTO com_adobe_granite_workflow_console_publish_workflow_publish_eve (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_console_publish_workflow_publish_eve'
--
UPDATE com_adobe_granite_workflow_console_publish_workflow_publish_eve SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_console_publish_workflow_publish_eve'
--
DELETE FROM com_adobe_granite_workflow_console_publish_workflow_publish_eve WHERE 1=2;

