--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialScoringImplScoringEventListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_scoring_impl_scoring_event_listener_propert'
--
SELECT event/topics, event/filter FROM com_adobe_cq_social_scoring_impl_scoring_event_listener_propert WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_scoring_impl_scoring_event_listener_propert'
--
INSERT INTO com_adobe_cq_social_scoring_impl_scoring_event_listener_propert (event/topics, event/filter) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_scoring_impl_scoring_event_listener_propert'
--
UPDATE com_adobe_cq_social_scoring_impl_scoring_event_listener_propert SET event/topics = ?, event/filter = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_scoring_impl_scoring_event_listener_propert'
--
DELETE FROM com_adobe_cq_social_scoring_impl_scoring_event_listener_propert WHERE 1=2;

