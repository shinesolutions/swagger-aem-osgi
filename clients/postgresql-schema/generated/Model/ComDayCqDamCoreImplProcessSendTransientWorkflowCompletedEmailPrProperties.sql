--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_process_send_transient_workflow_comple'
--
SELECT process/label, notify_on_complete FROM com_day_cq_dam_core_impl_process_send_transient_workflow_comple WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_process_send_transient_workflow_comple'
--
INSERT INTO com_day_cq_dam_core_impl_process_send_transient_workflow_comple (process/label, notify_on_complete) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_process_send_transient_workflow_comple'
--
UPDATE com_day_cq_dam_core_impl_process_send_transient_workflow_comple SET process/label = ?, notify_on_complete = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_process_send_transient_workflow_comple'
--
DELETE FROM com_day_cq_dam_core_impl_process_send_transient_workflow_comple WHERE 1=2;

