--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReplicationImplReplicationContentFactoryProviderImplInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_replication_impl_replication_content_factory_provide'
--
SELECT pid, title, description, properties, bundle_location, service_location FROM com_day_cq_replication_impl_replication_content_factory_provide WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_replication_impl_replication_content_factory_provide'
--
INSERT INTO com_day_cq_replication_impl_replication_content_factory_provide (pid, title, description, properties, bundle_location, service_location) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_replication_impl_replication_content_factory_provide'
--
UPDATE com_day_cq_replication_impl_replication_content_factory_provide SET pid = ?, title = ?, description = ?, properties = ?, bundle_location = ?, service_location = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_replication_impl_replication_content_factory_provide'
--
DELETE FROM com_day_cq_replication_impl_replication_content_factory_provide WHERE 1=2;

