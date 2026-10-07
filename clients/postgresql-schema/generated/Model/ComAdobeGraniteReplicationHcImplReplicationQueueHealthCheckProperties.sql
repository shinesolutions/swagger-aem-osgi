--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_replication_hc_impl_replication_queue_health_'
--
SELECT number/of/retries/allowed, hc/tags FROM com_adobe_granite_replication_hc_impl_replication_queue_health_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_replication_hc_impl_replication_queue_health_'
--
INSERT INTO com_adobe_granite_replication_hc_impl_replication_queue_health_ (number/of/retries/allowed, hc/tags) VALUES (?, ?);

--
-- UPDATE template for table 'com_adobe_granite_replication_hc_impl_replication_queue_health_'
--
UPDATE com_adobe_granite_replication_hc_impl_replication_queue_health_ SET number/of/retries/allowed = ?, hc/tags = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_replication_hc_impl_replication_queue_health_'
--
DELETE FROM com_adobe_granite_replication_hc_impl_replication_queue_health_ WHERE 1=2;

