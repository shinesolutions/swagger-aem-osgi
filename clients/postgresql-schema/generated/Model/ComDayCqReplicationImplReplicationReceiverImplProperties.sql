--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReplicationImplReplicationReceiverImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_replication_impl_replication_receiver_impl_propertie'
--
SELECT receiver/tmpfile/threshold, receiver/packages/use/install FROM com_day_cq_replication_impl_replication_receiver_impl_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_replication_impl_replication_receiver_impl_propertie'
--
INSERT INTO com_day_cq_replication_impl_replication_receiver_impl_propertie (receiver/tmpfile/threshold, receiver/packages/use/install) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_replication_impl_replication_receiver_impl_propertie'
--
UPDATE com_day_cq_replication_impl_replication_receiver_impl_propertie SET receiver/tmpfile/threshold = ?, receiver/packages/use/install = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_replication_impl_replication_receiver_impl_propertie'
--
DELETE FROM com_day_cq_replication_impl_replication_receiver_impl_propertie WHERE 1=2;

