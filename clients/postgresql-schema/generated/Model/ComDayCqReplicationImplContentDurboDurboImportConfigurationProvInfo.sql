--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_cq_replication_impl_content_durbo_durbo_import_configur'
--
SELECT pid, title, description, properties FROM com_day_cq_replication_impl_content_durbo_durbo_import_configur WHERE 1=1;

--
-- INSERT template for table 'com_day_cq_replication_impl_content_durbo_durbo_import_configur'
--
INSERT INTO com_day_cq_replication_impl_content_durbo_durbo_import_configur (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_cq_replication_impl_content_durbo_durbo_import_configur'
--
UPDATE com_day_cq_replication_impl_content_durbo_durbo_import_configur SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_cq_replication_impl_content_durbo_durbo_import_configur'
--
DELETE FROM com_day_cq_replication_impl_content_durbo_durbo_import_configur WHERE 1=2;

