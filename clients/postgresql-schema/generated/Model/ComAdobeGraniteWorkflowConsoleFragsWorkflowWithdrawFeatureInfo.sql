--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_console_frags_workflow_withdraw_feat'
--
SELECT pid, title, description, properties FROM com_adobe_granite_workflow_console_frags_workflow_withdraw_feat WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_console_frags_workflow_withdraw_feat'
--
INSERT INTO com_adobe_granite_workflow_console_frags_workflow_withdraw_feat (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_console_frags_workflow_withdraw_feat'
--
UPDATE com_adobe_granite_workflow_console_frags_workflow_withdraw_feat SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_console_frags_workflow_withdraw_feat'
--
DELETE FROM com_adobe_granite_workflow_console_frags_workflow_withdraw_feat WHERE 1=2;

