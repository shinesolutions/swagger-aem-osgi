--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_granite_replication_hc_impl_replication_queue_health_'
--
SELECT pid, title, description, properties FROM com_adobe_granite_replication_hc_impl_replication_queue_health_ WHERE 1=1;

--
-- INSERT template for table 'com_adobe_granite_replication_hc_impl_replication_queue_health_'
--
INSERT INTO com_adobe_granite_replication_hc_impl_replication_queue_health_ (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_granite_replication_hc_impl_replication_queue_health_'
--
UPDATE com_adobe_granite_replication_hc_impl_replication_queue_health_ SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_granite_replication_hc_impl_replication_queue_health_'
--
DELETE FROM com_adobe_granite_replication_hc_impl_replication_queue_health_ WHERE 1=2;

