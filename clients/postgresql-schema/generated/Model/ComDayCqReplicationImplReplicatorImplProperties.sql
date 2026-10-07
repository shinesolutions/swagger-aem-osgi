--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReplicationImplReplicatorImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_replication_impl_replicator_impl_properties'
--
SELECT distribute_events FROM com_day_cq_replication_impl_replicator_impl_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_replication_impl_replicator_impl_properties'
--
INSERT INTO com_day_cq_replication_impl_replicator_impl_properties (distribute_events) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_replication_impl_replicator_impl_properties'
--
UPDATE com_day_cq_replication_impl_replicator_impl_properties SET distribute_events = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_replication_impl_replicator_impl_properties'
--
DELETE FROM com_day_cq_replication_impl_replicator_impl_properties WHERE 1=2;

