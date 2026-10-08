--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_core_payloadmap_payload_move_listene'
--
SELECT payload/move/white/list, payload/move/handle/from/workflow/process FROM com_adobe_granite_workflow_core_payloadmap_payload_move_listene WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_core_payloadmap_payload_move_listene'
--
INSERT INTO com_adobe_granite_workflow_core_payloadmap_payload_move_listene (payload/move/white/list, payload/move/handle/from/workflow/process) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_core_payloadmap_payload_move_listene'
--
UPDATE com_adobe_granite_workflow_core_payloadmap_payload_move_listene SET payload/move/white/list = ?, payload/move/handle/from/workflow/process = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_core_payloadmap_payload_move_listene'
--
DELETE FROM com_adobe_granite_workflow_core_payloadmap_payload_move_listene WHERE 1=2;

