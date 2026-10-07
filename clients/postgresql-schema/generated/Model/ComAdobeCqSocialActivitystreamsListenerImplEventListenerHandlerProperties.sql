--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_activitystreams_listener_impl_event_listene'
--
SELECT event/topics, event/filter FROM com_adobe_cq_social_activitystreams_listener_impl_event_listene WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_activitystreams_listener_impl_event_listene'
--
INSERT INTO com_adobe_cq_social_activitystreams_listener_impl_event_listene (event/topics, event/filter) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_activitystreams_listener_impl_event_listene'
--
UPDATE com_adobe_cq_social_activitystreams_listener_impl_event_listene SET event/topics = ?, event/filter = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_activitystreams_listener_impl_event_listene'
--
DELETE FROM com_adobe_cq_social_activitystreams_listener_impl_event_listene WHERE 1=2;

