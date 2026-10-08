--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWorkflowImplEmailEMailNotificationServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_workflow_impl_email_e_mail_notification_service_prop'
--
SELECT from/address, host/prefix, notify/onabort, notify/oncomplete, notify/oncontainercomplete, notify/useronly FROM com_day_cq_workflow_impl_email_e_mail_notification_service_prop WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_workflow_impl_email_e_mail_notification_service_prop'
--
INSERT INTO com_day_cq_workflow_impl_email_e_mail_notification_service_prop (from/address, host/prefix, notify/onabort, notify/oncomplete, notify/oncontainercomplete, notify/useronly) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_workflow_impl_email_e_mail_notification_service_prop'
--
UPDATE com_day_cq_workflow_impl_email_e_mail_notification_service_prop SET from/address = ?, host/prefix = ?, notify/onabort = ?, notify/oncomplete = ?, notify/oncontainercomplete = ?, notify/useronly = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_workflow_impl_email_e_mail_notification_service_prop'
--
DELETE FROM com_day_cq_workflow_impl_email_e_mail_notification_service_prop WHERE 1=2;

