--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingCommonsLogLogManagerFactoryConfigProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_commons_log_log_manager_factory_config_propert'
--
SELECT org/apache/sling/commons/log/level, org/apache/sling/commons/log/file, org/apache/sling/commons/log/pattern, org/apache/sling/commons/log/names, org/apache/sling/commons/log/additiv FROM org_apache_sling_commons_log_log_manager_factory_config_propert WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_commons_log_log_manager_factory_config_propert'
--
INSERT INTO org_apache_sling_commons_log_log_manager_factory_config_propert (org/apache/sling/commons/log/level, org/apache/sling/commons/log/file, org/apache/sling/commons/log/pattern, org/apache/sling/commons/log/names, org/apache/sling/commons/log/additiv) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_commons_log_log_manager_factory_config_propert'
--
UPDATE org_apache_sling_commons_log_log_manager_factory_config_propert SET org/apache/sling/commons/log/level = ?, org/apache/sling/commons/log/file = ?, org/apache/sling/commons/log/pattern = ?, org/apache/sling/commons/log/names = ?, org/apache/sling/commons/log/additiv = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_commons_log_log_manager_factory_config_propert'
--
DELETE FROM org_apache_sling_commons_log_log_manager_factory_config_propert WHERE 1=2;

