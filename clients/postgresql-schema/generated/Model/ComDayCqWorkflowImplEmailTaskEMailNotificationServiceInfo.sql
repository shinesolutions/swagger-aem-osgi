--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_workflow_impl_email_task_e_mail_notification_service'
--
SELECT pid, title, description, properties FROM com_day_cq_workflow_impl_email_task_e_mail_notification_service WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_workflow_impl_email_task_e_mail_notification_service'
--
INSERT INTO com_day_cq_workflow_impl_email_task_e_mail_notification_service (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_workflow_impl_email_task_e_mail_notification_service'
--
UPDATE com_day_cq_workflow_impl_email_task_e_mail_notification_service SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_workflow_impl_email_task_e_mail_notification_service'
--
DELETE FROM com_day_cq_workflow_impl_email_task_e_mail_notification_service WHERE 1=2;

