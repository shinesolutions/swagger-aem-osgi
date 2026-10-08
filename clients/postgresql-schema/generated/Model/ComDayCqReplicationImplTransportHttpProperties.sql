--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReplicationImplTransportHttpProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_replication_impl_transport_http_properties'
--
SELECT disabled/cipher/suites, enabled/cipher/suites FROM com_day_cq_replication_impl_transport_http_properties WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_replication_impl_transport_http_properties'
--
INSERT INTO com_day_cq_replication_impl_transport_http_properties (disabled/cipher/suites, enabled/cipher/suites) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_replication_impl_transport_http_properties'
--
UPDATE com_day_cq_replication_impl_transport_http_properties SET disabled/cipher/suites = ?, enabled/cipher/suites = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_replication_impl_transport_http_properties'
--
DELETE FROM com_day_cq_replication_impl_transport_http_properties WHERE 1=2;

