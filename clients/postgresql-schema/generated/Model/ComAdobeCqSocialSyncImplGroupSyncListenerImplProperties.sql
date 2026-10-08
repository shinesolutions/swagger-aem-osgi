--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplGroupSyncListenerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_sync_impl_group_sync_listener_impl_properti'
--
SELECT nodetypes, ignorableprops, ignorablenodes, enabled, distfolders FROM com_adobe_cq_social_sync_impl_group_sync_listener_impl_properti WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_sync_impl_group_sync_listener_impl_properti'
--
INSERT INTO com_adobe_cq_social_sync_impl_group_sync_listener_impl_properti (nodetypes, ignorableprops, ignorablenodes, enabled, distfolders) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_sync_impl_group_sync_listener_impl_properti'
--
UPDATE com_adobe_cq_social_sync_impl_group_sync_listener_impl_properti SET nodetypes = ?, ignorableprops = ?, ignorablenodes = ?, enabled = ?, distfolders = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_sync_impl_group_sync_listener_impl_properti'
--
DELETE FROM com_adobe_cq_social_sync_impl_group_sync_listener_impl_properti WHERE 1=2;

