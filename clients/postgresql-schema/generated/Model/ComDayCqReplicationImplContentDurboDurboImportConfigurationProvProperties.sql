--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_replication_impl_content_durbo_durbo_import_configur'
--
SELECT preserve/hierarchy/nodes, ignore/versioning, import/acl, save/threshold, preserve/user/paths, preserve/uuid, preserve/uuid/nodetypes, preserve/uuid/subtrees, auto/commit FROM com_day_cq_replication_impl_content_durbo_durbo_import_configur WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_replication_impl_content_durbo_durbo_import_configur'
--
INSERT INTO com_day_cq_replication_impl_content_durbo_durbo_import_configur (preserve/hierarchy/nodes, ignore/versioning, import/acl, save/threshold, preserve/user/paths, preserve/uuid, preserve/uuid/nodetypes, preserve/uuid/subtrees, auto/commit) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_replication_impl_content_durbo_durbo_import_configur'
--
UPDATE com_day_cq_replication_impl_content_durbo_durbo_import_configur SET preserve/hierarchy/nodes = ?, ignore/versioning = ?, import/acl = ?, save/threshold = ?, preserve/user/paths = ?, preserve/uuid = ?, preserve/uuid/nodetypes = ?, preserve/uuid/subtrees = ?, auto/commit = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_replication_impl_content_durbo_durbo_import_configur'
--
DELETE FROM com_day_cq_replication_impl_content_durbo_durbo_import_configur WHERE 1=2;

