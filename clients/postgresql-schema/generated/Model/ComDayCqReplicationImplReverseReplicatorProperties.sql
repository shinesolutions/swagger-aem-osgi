--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReplicationImplReverseReplicatorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_replication_impl_reverse_replicator_properties'
--
SELECT scheduler/period FROM com_day_cq_replication_impl_reverse_replicator_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_replication_impl_reverse_replicator_properties'
--
INSERT INTO com_day_cq_replication_impl_reverse_replicator_properties (scheduler/period) VALUES (?);

--
-- UPDATE template for table 'com_day_cq_replication_impl_reverse_replicator_properties'
--
UPDATE com_day_cq_replication_impl_reverse_replicator_properties SET scheduler/period = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_replication_impl_reverse_replicator_properties'
--
DELETE FROM com_day_cq_replication_impl_reverse_replicator_properties WHERE 1=2;

