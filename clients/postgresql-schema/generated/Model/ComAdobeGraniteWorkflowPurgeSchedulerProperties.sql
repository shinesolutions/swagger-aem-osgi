--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowPurgeSchedulerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_purge_scheduler_properties'
--
SELECT scheduledpurge/name, scheduledpurge/workflow_status, scheduledpurge/model_ids, scheduledpurge/daysold FROM com_adobe_granite_workflow_purge_scheduler_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_purge_scheduler_properties'
--
INSERT INTO com_adobe_granite_workflow_purge_scheduler_properties (scheduledpurge/name, scheduledpurge/workflow_status, scheduledpurge/model_ids, scheduledpurge/daysold) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_purge_scheduler_properties'
--
UPDATE com_adobe_granite_workflow_purge_scheduler_properties SET scheduledpurge/name = ?, scheduledpurge/workflow_status = ?, scheduledpurge/model_ids = ?, scheduledpurge/daysold = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_purge_scheduler_properties'
--
DELETE FROM com_adobe_granite_workflow_purge_scheduler_properties WHERE 1=2;

