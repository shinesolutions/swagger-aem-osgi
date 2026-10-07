--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'orgApacheSlingDatasourceDataSourceFactoryProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'org_apache_sling_datasource_data_source_factory_properties'
--
SELECT datasource/name, datasource/svc/prop/name, driver_class_name, url, username, "password", default_auto_commit, default_read_only, default_transaction_isolation, default_catalog, max_active, max_idle, min_idle, initial_size, max_wait, max_age, test_on_borrow, test_on_return, test_while_idle, validation_query, validation_query_timeout, time_between_eviction_runs_millis, min_evictable_idle_time_millis, connection_properties, init_sql, jdbc_interceptors, validation_interval, log_validation_errors, datasource/svc/properties FROM org_apache_sling_datasource_data_source_factory_properties WHERE 1=1;

--
-- INSERT template for table 'org_apache_sling_datasource_data_source_factory_properties'
--
INSERT INTO org_apache_sling_datasource_data_source_factory_properties (datasource/name, datasource/svc/prop/name, driver_class_name, url, username, "password", default_auto_commit, default_read_only, default_transaction_isolation, default_catalog, max_active, max_idle, min_idle, initial_size, max_wait, max_age, test_on_borrow, test_on_return, test_while_idle, validation_query, validation_query_timeout, time_between_eviction_runs_millis, min_evictable_idle_time_millis, connection_properties, init_sql, jdbc_interceptors, validation_interval, log_validation_errors, datasource/svc/properties) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'org_apache_sling_datasource_data_source_factory_properties'
--
UPDATE org_apache_sling_datasource_data_source_factory_properties SET datasource/name = ?, datasource/svc/prop/name = ?, driver_class_name = ?, url = ?, username = ?, "password" = ?, default_auto_commit = ?, default_read_only = ?, default_transaction_isolation = ?, default_catalog = ?, max_active = ?, max_idle = ?, min_idle = ?, initial_size = ?, max_wait = ?, max_age = ?, test_on_borrow = ?, test_on_return = ?, test_while_idle = ?, validation_query = ?, validation_query_timeout = ?, time_between_eviction_runs_millis = ?, min_evictable_idle_time_millis = ?, connection_properties = ?, init_sql = ?, jdbc_interceptors = ?, validation_interval = ?, log_validation_errors = ?, datasource/svc/properties = ? WHERE 1=2;

--
-- DELETE template for table 'org_apache_sling_datasource_data_source_factory_properties'
--
DELETE FROM org_apache_sling_datasource_data_source_factory_properties WHERE 1=2;

