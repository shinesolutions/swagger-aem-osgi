--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialNotificationsImplNotificationsRouterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_notifications_impl_notifications_router_pro'
--
SELECT event/topics, event/filter FROM com_adobe_cq_social_notifications_impl_notifications_router_pro WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_notifications_impl_notifications_router_pro'
--
INSERT INTO com_adobe_cq_social_notifications_impl_notifications_router_pro (event/topics, event/filter) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_notifications_impl_notifications_router_pro'
--
UPDATE com_adobe_cq_social_notifications_impl_notifications_router_pro SET event/topics = ?, event/filter = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_notifications_impl_notifications_router_pro'
--
DELETE FROM com_adobe_cq_social_notifications_impl_notifications_router_pro WHERE 1=2;

