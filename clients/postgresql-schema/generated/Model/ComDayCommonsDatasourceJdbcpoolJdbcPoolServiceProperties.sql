--
-- "Adobe Experience Manager OSGI config (AEM) API"
-- Prepared SQL queries for 'comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertie'
--
SELECT jdbc/driver/class, jdbc/connection/uri, jdbc/username, jdbc/password, jdbc/validation/query, default/readonly, default/autocommit, pool/size, pool/max/wait/msec, datasource/name, datasource/svc/properties FROM com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertie WHERE 1=1;

--
-- INSERT template for table 'com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertie'
--
INSERT INTO com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertie (jdbc/driver/class, jdbc/connection/uri, jdbc/username, jdbc/password, jdbc/validation/query, default/readonly, default/autocommit, pool/size, pool/max/wait/msec, datasource/name, datasource/svc/properties) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertie'
--
UPDATE com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertie SET jdbc/driver/class = ?, jdbc/connection/uri = ?, jdbc/username = ?, jdbc/password = ?, jdbc/validation/query = ?, default/readonly = ?, default/autocommit = ?, pool/size = ?, pool/max/wait/msec = ?, datasource/name = ?, datasource/svc/properties = ? WHERE 1=2;

--
-- DELETE template for table 'com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertie'
--
DELETE FROM com_day_commons_datasource_jdbcpool_jdbc_pool_service_propertie WHERE 1=2;

