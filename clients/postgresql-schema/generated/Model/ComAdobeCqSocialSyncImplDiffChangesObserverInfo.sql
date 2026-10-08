--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplDiffChangesObserverInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_sync_impl_diff_changes_observer_info'
--
SELECT pid, title, description, properties FROM com_adobe_cq_social_sync_impl_diff_changes_observer_info WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_sync_impl_diff_changes_observer_info'
--
INSERT INTO com_adobe_cq_social_sync_impl_diff_changes_observer_info (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_sync_impl_diff_changes_observer_info'
--
UPDATE com_adobe_cq_social_sync_impl_diff_changes_observer_info SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_sync_impl_diff_changes_observer_info'
--
DELETE FROM com_adobe_cq_social_sync_impl_diff_changes_observer_info WHERE 1=2;

