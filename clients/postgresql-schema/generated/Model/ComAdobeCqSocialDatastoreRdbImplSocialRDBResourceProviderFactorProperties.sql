--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov'
--
SELECT solr/zk/timeout, solr/commit, cache/on, concurrency/level, cache/start/size, cache/ttl, cache/size FROM com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov WHERE 1=1;

--
-- INSERT template for table 'com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov'
--
INSERT INTO com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov (solr/zk/timeout, solr/commit, cache/on, concurrency/level, cache/start/size, cache/ttl, cache/size) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov'
--
UPDATE com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov SET solr/zk/timeout = ?, solr/commit = ?, cache/on = ?, concurrency/level = ?, cache/start/size = ?, cache/ttl = ?, cache/size = ? WHERE 1=2;

--
-- DELETE template for table 'com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov'
--
DELETE FROM com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_prov WHERE 1=2;

