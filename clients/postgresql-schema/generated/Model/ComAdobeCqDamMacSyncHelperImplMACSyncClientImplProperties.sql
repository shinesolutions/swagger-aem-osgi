--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_prop'
--
SELECT com/adobe/dam/mac/sync/client/so/timeout FROM com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_prop WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_prop'
--
INSERT INTO com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_prop (com/adobe/dam/mac/sync/client/so/timeout) VALUES (?);

--
-- UPDATE template for table 'com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_prop'
--
UPDATE com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_prop SET com/adobe/dam/mac/sync/client/so/timeout = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_prop'
--
DELETE FROM com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_prop WHERE 1=2;

