--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialNotificationsImplMentionsRouterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_notifications_impl_mentions_router_properti'
--
SELECT event/topics, event/filter FROM com_adobe_cq_social_notifications_impl_mentions_router_properti WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_notifications_impl_mentions_router_properti'
--
INSERT INTO com_adobe_cq_social_notifications_impl_mentions_router_properti (event/topics, event/filter) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_notifications_impl_mentions_router_properti'
--
UPDATE com_adobe_cq_social_notifications_impl_mentions_router_properti SET event/topics = ?, event/filter = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_notifications_impl_mentions_router_properti'
--
DELETE FROM com_adobe_cq_social_notifications_impl_mentions_router_properti WHERE 1=2;

