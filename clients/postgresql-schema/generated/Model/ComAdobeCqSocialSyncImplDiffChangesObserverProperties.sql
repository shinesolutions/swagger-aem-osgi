--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplDiffChangesObserverProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_sync_impl_diff_changes_observer_properties'
--
SELECT enabled, agent_name, diff_path, property_names FROM com_adobe_cq_social_sync_impl_diff_changes_observer_properties WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_sync_impl_diff_changes_observer_properties'
--
INSERT INTO com_adobe_cq_social_sync_impl_diff_changes_observer_properties (enabled, agent_name, diff_path, property_names) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_sync_impl_diff_changes_observer_properties'
--
UPDATE com_adobe_cq_social_sync_impl_diff_changes_observer_properties SET enabled = ?, agent_name = ?, diff_path = ?, property_names = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_sync_impl_diff_changes_observer_properties'
--
DELETE FROM com_adobe_cq_social_sync_impl_diff_changes_observer_properties WHERE 1=2;

