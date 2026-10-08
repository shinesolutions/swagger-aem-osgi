--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_activitystreams_client_impl_social_activity'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_activitystreams_client_impl_social_activity WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_activitystreams_client_impl_social_activity'
--
INSERT INTO com_adobe_cq_social_activitystreams_client_impl_social_activity (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_activitystreams_client_impl_social_activity'
--
UPDATE com_adobe_cq_social_activitystreams_client_impl_social_activity SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_activitystreams_client_impl_social_activity'
--
DELETE FROM com_adobe_cq_social_activitystreams_client_impl_social_activity WHERE 1=2;

