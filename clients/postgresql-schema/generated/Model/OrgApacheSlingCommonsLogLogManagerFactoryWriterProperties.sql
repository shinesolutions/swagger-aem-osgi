--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsLogLogManagerFactoryWriterProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_log_log_manager_factory_writer_propert'
--
SELECT org/apache/sling/commons/log/file, org/apache/sling/commons/log/file/number, org/apache/sling/commons/log/file/size, org/apache/sling/commons/log/file/buffered FROM org_apache_sling_commons_log_log_manager_factory_writer_propert WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_log_log_manager_factory_writer_propert'
--
INSERT INTO org_apache_sling_commons_log_log_manager_factory_writer_propert (org/apache/sling/commons/log/file, org/apache/sling/commons/log/file/number, org/apache/sling/commons/log/file/size, org/apache/sling/commons/log/file/buffered) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_commons_log_log_manager_factory_writer_propert'
--
UPDATE org_apache_sling_commons_log_log_manager_factory_writer_propert SET org/apache/sling/commons/log/file = ?, org/apache/sling/commons/log/file/number = ?, org/apache/sling/commons/log/file/size = ?, org/apache/sling/commons/log/file/buffered = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_log_log_manager_factory_writer_propert'
--
DELETE FROM org_apache_sling_commons_log_log_manager_factory_writer_propert WHERE 1=2;

