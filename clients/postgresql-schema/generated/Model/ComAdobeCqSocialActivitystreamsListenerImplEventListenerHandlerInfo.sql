--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_activitystreams_listener_impl_event_listene'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_activitystreams_listener_impl_event_listene WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_activitystreams_listener_impl_event_listene'
--
INSERT INTO com_adobe_cq_social_activitystreams_listener_impl_event_listene (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_activitystreams_listener_impl_event_listene'
--
UPDATE com_adobe_cq_social_activitystreams_listener_impl_event_listene SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_activitystreams_listener_impl_event_listene'
--
DELETE FROM com_adobe_cq_social_activitystreams_listener_impl_event_listene WHERE 1=2;

