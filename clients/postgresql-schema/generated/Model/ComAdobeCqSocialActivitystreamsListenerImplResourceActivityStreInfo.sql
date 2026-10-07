--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_activitystreams_listener_impl_resource_acti'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_adobe_cq_social_activitystreams_listener_impl_resource_acti WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_activitystreams_listener_impl_resource_acti'
--
INSERT INTO com_adobe_cq_social_activitystreams_listener_impl_resource_acti (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_activitystreams_listener_impl_resource_acti'
--
UPDATE com_adobe_cq_social_activitystreams_listener_impl_resource_acti SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_activitystreams_listener_impl_resource_acti'
--
DELETE FROM com_adobe_cq_social_activitystreams_listener_impl_resource_acti WHERE 1=2;

