--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_activitystreams_listener_impl_moderation_ev'
--
SELECT accepted, ranked FROM com_adobe_cq_social_activitystreams_listener_impl_moderation_ev WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_activitystreams_listener_impl_moderation_ev'
--
INSERT INTO com_adobe_cq_social_activitystreams_listener_impl_moderation_ev (accepted, ranked) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_activitystreams_listener_impl_moderation_ev'
--
UPDATE com_adobe_cq_social_activitystreams_listener_impl_moderation_ev SET accepted = ?, ranked = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_activitystreams_listener_impl_moderation_ev'
--
DELETE FROM com_adobe_cq_social_activitystreams_listener_impl_moderation_ev WHERE 1=2;

