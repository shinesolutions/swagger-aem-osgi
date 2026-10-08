--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqWcmNotificationImplNotificationManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_wcm_notification_impl_notification_manager_impl_prop'
--
SELECT event/topics FROM com_day_cq_wcm_notification_impl_notification_manager_impl_prop WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_wcm_notification_impl_notification_manager_impl_prop'
--
INSERT INTO com_day_cq_wcm_notification_impl_notification_manager_impl_prop (event/topics) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_wcm_notification_impl_notification_manager_impl_prop'
--
UPDATE com_day_cq_wcm_notification_impl_notification_manager_impl_prop SET event/topics = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_wcm_notification_impl_notification_manager_impl_prop'
--
DELETE FROM com_day_cq_wcm_notification_impl_notification_manager_impl_prop WHERE 1=2;

