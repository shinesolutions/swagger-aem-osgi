--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_activitystreams_listener_impl_rating_event_'
--
SELECT ranking, "enable" FROM com_adobe_cq_social_activitystreams_listener_impl_rating_event_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_activitystreams_listener_impl_rating_event_'
--
INSERT INTO com_adobe_cq_social_activitystreams_listener_impl_rating_event_ (ranking, "enable") VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_activitystreams_listener_impl_rating_event_'
--
UPDATE com_adobe_cq_social_activitystreams_listener_impl_rating_event_ SET ranking = ?, "enable" = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_activitystreams_listener_impl_rating_event_'
--
DELETE FROM com_adobe_cq_social_activitystreams_listener_impl_rating_event_ WHERE 1=2;

