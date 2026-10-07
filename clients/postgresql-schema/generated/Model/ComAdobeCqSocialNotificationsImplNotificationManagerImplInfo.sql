--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialNotificationsImplNotificationManagerImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_notifications_impl_notification_manager_imp'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_notifications_impl_notification_manager_imp WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_notifications_impl_notification_manager_imp'
--
INSERT INTO com_adobe_cq_social_notifications_impl_notification_manager_imp (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_notifications_impl_notification_manager_imp'
--
UPDATE com_adobe_cq_social_notifications_impl_notification_manager_imp SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_notifications_impl_notification_manager_imp'
--
DELETE FROM com_adobe_cq_social_notifications_impl_notification_manager_imp WHERE 1=2;

