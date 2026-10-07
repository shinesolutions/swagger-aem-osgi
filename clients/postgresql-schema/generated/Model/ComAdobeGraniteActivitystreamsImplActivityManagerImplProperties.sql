--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteActivitystreamsImplActivityManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_activitystreams_impl_activity_manager_impl_pr'
--
SELECT aggregate/relationships, aggregate/descend/virtual FROM com_adobe_granite_activitystreams_impl_activity_manager_impl_pr WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_activitystreams_impl_activity_manager_impl_pr'
--
INSERT INTO com_adobe_granite_activitystreams_impl_activity_manager_impl_pr (aggregate/relationships, aggregate/descend/virtual) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_activitystreams_impl_activity_manager_impl_pr'
--
UPDATE com_adobe_granite_activitystreams_impl_activity_manager_impl_pr SET aggregate/relationships = ?, aggregate/descend/virtual = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_activitystreams_impl_activity_manager_impl_pr'
--
DELETE FROM com_adobe_granite_activitystreams_impl_activity_manager_impl_pr WHERE 1=2;

