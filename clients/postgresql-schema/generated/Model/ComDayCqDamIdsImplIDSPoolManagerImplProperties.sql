--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqDamIdsImplIDSPoolManagerImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties'
--
SELECT max/errors/to/blacklist, retry/interval/to/whitelist, connect/timeout, socket/timeout, process/label, connection/use/max FROM com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties'
--
INSERT INTO com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties (max/errors/to/blacklist, retry/interval/to/whitelist, connect/timeout, socket/timeout, process/label, connection/use/max) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties'
--
UPDATE com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties SET max/errors/to/blacklist = ?, retry/interval/to/whitelist = ?, connect/timeout = ?, socket/timeout = ?, process/label = ?, connection/use/max = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties'
--
DELETE FROM com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties WHERE 1=2;

