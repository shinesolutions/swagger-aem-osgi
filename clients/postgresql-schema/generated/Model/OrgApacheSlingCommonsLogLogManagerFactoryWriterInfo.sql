--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsLogLogManagerFactoryWriterInfo' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_log_log_manager_factory_writer_info'
--
SELECT pid, title, description, properties FROM org_apache_sling_commons_log_log_manager_factory_writer_info WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_log_log_manager_factory_writer_info'
--
INSERT INTO org_apache_sling_commons_log_log_manager_factory_writer_info (pid, title, description, properties) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_commons_log_log_manager_factory_writer_info'
--
UPDATE org_apache_sling_commons_log_log_manager_factory_writer_info SET pid = ?, title = ?, description = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_log_log_manager_factory_writer_info'
--
DELETE FROM org_apache_sling_commons_log_log_manager_factory_writer_info WHERE 1=2;

