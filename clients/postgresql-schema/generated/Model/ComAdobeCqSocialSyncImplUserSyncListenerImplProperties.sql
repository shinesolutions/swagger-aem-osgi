--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialSyncImplUserSyncListenerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_sync_impl_user_sync_listener_impl_propertie'
--
SELECT nodetypes, ignorableprops, ignorablenodes, enabled, distfolders FROM com_adobe_cq_social_sync_impl_user_sync_listener_impl_propertie WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_sync_impl_user_sync_listener_impl_propertie'
--
INSERT INTO com_adobe_cq_social_sync_impl_user_sync_listener_impl_propertie (nodetypes, ignorableprops, ignorablenodes, enabled, distfolders) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_sync_impl_user_sync_listener_impl_propertie'
--
UPDATE com_adobe_cq_social_sync_impl_user_sync_listener_impl_propertie SET nodetypes = ?, ignorableprops = ?, ignorablenodes = ?, enabled = ?, distfolders = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_sync_impl_user_sync_listener_impl_propertie'
--
DELETE FROM com_adobe_cq_social_sync_impl_user_sync_listener_impl_propertie WHERE 1=2;

