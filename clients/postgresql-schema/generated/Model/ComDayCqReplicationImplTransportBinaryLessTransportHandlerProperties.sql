--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_replication_impl_transport_binary_less_transport_han'
--
SELECT disabled/cipher/suites, enabled/cipher/suites FROM com_day_cq_replication_impl_transport_binary_less_transport_han WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_replication_impl_transport_binary_less_transport_han'
--
INSERT INTO com_day_cq_replication_impl_transport_binary_less_transport_han (disabled/cipher/suites, enabled/cipher/suites) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_replication_impl_transport_binary_less_transport_han'
--
UPDATE com_day_cq_replication_impl_transport_binary_less_transport_han SET disabled/cipher/suites = ?, enabled/cipher/suites = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_replication_impl_transport_binary_less_transport_han'
--
DELETE FROM com_day_cq_replication_impl_transport_binary_less_transport_han WHERE 1=2;

