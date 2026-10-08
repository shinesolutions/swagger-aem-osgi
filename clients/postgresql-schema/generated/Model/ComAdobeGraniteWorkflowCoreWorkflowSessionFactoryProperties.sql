--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_workflow_core_workflow_session_factory_proper'
--
SELECT granite/workflowinbox/sort/property_name, granite/workflowinbox/sort/order, cq/workflow/job/retry, cq/workflow/superuser, granite/workflow/inbox_query_size, granite/workflow/admin_user_group_filter, granite/workflow/enforce_workitem_assignee_permissions, granite/workflow/enforce_workflow_initiator_permissions, granite/workflow/inject_tenant_id_in_job_topics, granite/workflow/max_purge_save_threshold, granite/workflow/max_purge_query_count FROM com_adobe_granite_workflow_core_workflow_session_factory_proper WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_workflow_core_workflow_session_factory_proper'
--
INSERT INTO com_adobe_granite_workflow_core_workflow_session_factory_proper (granite/workflowinbox/sort/property_name, granite/workflowinbox/sort/order, cq/workflow/job/retry, cq/workflow/superuser, granite/workflow/inbox_query_size, granite/workflow/admin_user_group_filter, granite/workflow/enforce_workitem_assignee_permissions, granite/workflow/enforce_workflow_initiator_permissions, granite/workflow/inject_tenant_id_in_job_topics, granite/workflow/max_purge_save_threshold, granite/workflow/max_purge_query_count) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_workflow_core_workflow_session_factory_proper'
--
UPDATE com_adobe_granite_workflow_core_workflow_session_factory_proper SET granite/workflowinbox/sort/property_name = ?, granite/workflowinbox/sort/order = ?, cq/workflow/job/retry = ?, cq/workflow/superuser = ?, granite/workflow/inbox_query_size = ?, granite/workflow/admin_user_group_filter = ?, granite/workflow/enforce_workitem_assignee_permissions = ?, granite/workflow/enforce_workflow_initiator_permissions = ?, granite/workflow/inject_tenant_id_in_job_topics = ?, granite/workflow/max_purge_save_threshold = ?, granite/workflow/max_purge_query_count = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_workflow_core_workflow_session_factory_proper'
--
DELETE FROM com_adobe_granite_workflow_core_workflow_session_factory_proper WHERE 1=2;

