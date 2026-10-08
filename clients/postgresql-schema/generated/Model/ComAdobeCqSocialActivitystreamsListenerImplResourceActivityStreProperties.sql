--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_activitystreams_listener_impl_resource_acti'
--
SELECT stream_path, stream_name FROM com_adobe_cq_social_activitystreams_listener_impl_resource_acti WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_activitystreams_listener_impl_resource_acti'
--
INSERT INTO com_adobe_cq_social_activitystreams_listener_impl_resource_acti (stream_path, stream_name) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_activitystreams_listener_impl_resource_acti'
--
UPDATE com_adobe_cq_social_activitystreams_listener_impl_resource_acti SET stream_path = ?, stream_name = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_activitystreams_listener_impl_resource_acti'
--
DELETE FROM com_adobe_cq_social_activitystreams_listener_impl_resource_acti WHERE 1=2;

