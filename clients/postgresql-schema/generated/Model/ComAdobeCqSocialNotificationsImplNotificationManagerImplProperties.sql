--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialNotificationsImplNotificationManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_notifications_impl_notification_manager_imp'
--
SELECT max/unread/notification/count FROM com_adobe_cq_social_notifications_impl_notification_manager_imp WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_notifications_impl_notification_manager_imp'
--
INSERT INTO com_adobe_cq_social_notifications_impl_notification_manager_imp (max/unread/notification/count) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_social_notifications_impl_notification_manager_imp'
--
UPDATE com_adobe_cq_social_notifications_impl_notification_manager_imp SET max/unread/notification/count = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_notifications_impl_notification_manager_imp'
--
DELETE FROM com_adobe_cq_social_notifications_impl_notification_manager_imp WHERE 1=2;

