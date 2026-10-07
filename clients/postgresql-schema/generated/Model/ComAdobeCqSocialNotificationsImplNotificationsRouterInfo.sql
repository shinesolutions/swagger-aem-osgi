--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialNotificationsImplNotificationsRouterInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_notifications_impl_notifications_router_inf'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_notifications_impl_notifications_router_inf WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_notifications_impl_notifications_router_inf'
--
INSERT INTO com_adobe_cq_social_notifications_impl_notifications_router_inf (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_notifications_impl_notifications_router_inf'
--
UPDATE com_adobe_cq_social_notifications_impl_notifications_router_inf SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_notifications_impl_notifications_router_inf'
--
DELETE FROM com_adobe_cq_social_notifications_impl_notifications_router_inf WHERE 1=2;

