--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamCoreImplAssetMoveListenerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_core_impl_asset_move_listener_properties'
--
SELECT enabled FROM com_day_cq_dam_core_impl_asset_move_listener_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_core_impl_asset_move_listener_properties'
--
INSERT INTO com_day_cq_dam_core_impl_asset_move_listener_properties (enabled) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_dam_core_impl_asset_move_listener_properties'
--
UPDATE com_day_cq_dam_core_impl_asset_move_listener_properties SET enabled = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_core_impl_asset_move_listener_properties'
--
DELETE FROM com_day_cq_dam_core_impl_asset_move_listener_properties WHERE 1=2;

