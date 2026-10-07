--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReplicationImplReplicationContentFactoryProviderImplProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_replication_impl_replication_content_factory_provide'
--
SELECT replication/content/use_file_storage, replication/content/max_commit_attempts FROM com_day_cq_replication_impl_replication_content_factory_provide WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_replication_impl_replication_content_factory_provide'
--
INSERT INTO com_day_cq_replication_impl_replication_content_factory_provide (replication/content/use_file_storage, replication/content/max_commit_attempts) VALUES (?, ?);

--
-- UPDATE template for table 'com_day_cq_replication_impl_replication_content_factory_provide'
--
UPDATE com_day_cq_replication_impl_replication_content_factory_provide SET replication/content/use_file_storage = ?, replication/content/max_commit_attempts = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_replication_impl_replication_content_factory_provide'
--
DELETE FROM com_day_cq_replication_impl_replication_content_factory_provide WHERE 1=2;

