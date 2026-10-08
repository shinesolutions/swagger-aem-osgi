--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqProjectsPurgeSchedulerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_projects_purge_scheduler_properties'
--
SELECT scheduledpurge/name, scheduledpurge/purge_active, scheduledpurge/templates, scheduledpurge/purge_groups, scheduledpurge/purge_assets, scheduledpurge/terminate_running_workflows, scheduledpurge/daysold, scheduledpurge/save_threshold FROM com_adobe_cq_projects_purge_scheduler_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_projects_purge_scheduler_properties'
--
INSERT INTO com_adobe_cq_projects_purge_scheduler_properties (scheduledpurge/name, scheduledpurge/purge_active, scheduledpurge/templates, scheduledpurge/purge_groups, scheduledpurge/purge_assets, scheduledpurge/terminate_running_workflows, scheduledpurge/daysold, scheduledpurge/save_threshold) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_projects_purge_scheduler_properties'
--
UPDATE com_adobe_cq_projects_purge_scheduler_properties SET scheduledpurge/name = ?, scheduledpurge/purge_active = ?, scheduledpurge/templates = ?, scheduledpurge/purge_groups = ?, scheduledpurge/purge_assets = ?, scheduledpurge/terminate_running_workflows = ?, scheduledpurge/daysold = ?, scheduledpurge/save_threshold = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_projects_purge_scheduler_properties'
--
DELETE FROM com_adobe_cq_projects_purge_scheduler_properties WHERE 1=2;

