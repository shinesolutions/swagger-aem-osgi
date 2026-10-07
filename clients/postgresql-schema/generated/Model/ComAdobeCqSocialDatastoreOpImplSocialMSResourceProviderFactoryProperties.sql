--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_datastore_op_impl_social_ms_resource_provid'
--
SELECT solr/zk/timeout, solr/commit, cache/on, concurrency/level, cache/start/size, cache/ttl, cache/size FROM com_adobe_cq_social_datastore_op_impl_social_ms_resource_provid WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_datastore_op_impl_social_ms_resource_provid'
--
INSERT INTO com_adobe_cq_social_datastore_op_impl_social_ms_resource_provid (solr/zk/timeout, solr/commit, cache/on, concurrency/level, cache/start/size, cache/ttl, cache/size) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_datastore_op_impl_social_ms_resource_provid'
--
UPDATE com_adobe_cq_social_datastore_op_impl_social_ms_resource_provid SET solr/zk/timeout = ?, solr/commit = ?, cache/on = ?, concurrency/level = ?, cache/start/size = ?, cache/ttl = ?, cache/size = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_datastore_op_impl_social_ms_resource_provid'
--
DELETE FROM com_adobe_cq_social_datastore_op_impl_social_ms_resource_provid WHERE 1=2;

