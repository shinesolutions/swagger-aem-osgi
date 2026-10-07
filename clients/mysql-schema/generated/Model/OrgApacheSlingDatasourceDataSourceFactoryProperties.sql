--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDatasourceDataSourceFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDatasourceDataSourceFactoryProperties`
--
SELECT `datasource.name`, `datasource.svc.prop.name`, `driverClassName`, `url`, `username`, `password`, `defaultAutoCommit`, `defaultReadOnly`, `defaultTransactionIsolation`, `defaultCatalog`, `maxActive`, `maxIdle`, `minIdle`, `initialSize`, `maxWait`, `maxAge`, `testOnBorrow`, `testOnReturn`, `testWhileIdle`, `validationQuery`, `validationQueryTimeout`, `timeBetweenEvictionRunsMillis`, `minEvictableIdleTimeMillis`, `connectionProperties`, `initSQL`, `jdbcInterceptors`, `validationInterval`, `logValidationErrors`, `datasource.svc.properties` FROM `orgApacheSlingDatasourceDataSourceFactoryProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDatasourceDataSourceFactoryProperties`
--
INSERT INTO `orgApacheSlingDatasourceDataSourceFactoryProperties`(`datasource.name`, `datasource.svc.prop.name`, `driverClassName`, `url`, `username`, `password`, `defaultAutoCommit`, `defaultReadOnly`, `defaultTransactionIsolation`, `defaultCatalog`, `maxActive`, `maxIdle`, `minIdle`, `initialSize`, `maxWait`, `maxAge`, `testOnBorrow`, `testOnReturn`, `testWhileIdle`, `validationQuery`, `validationQueryTimeout`, `timeBetweenEvictionRunsMillis`, `minEvictableIdleTimeMillis`, `connectionProperties`, `initSQL`, `jdbcInterceptors`, `validationInterval`, `logValidationErrors`, `datasource.svc.properties`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDatasourceDataSourceFactoryProperties`
--
UPDATE `orgApacheSlingDatasourceDataSourceFactoryProperties` SET `datasource.name` = ?, `datasource.svc.prop.name` = ?, `driverClassName` = ?, `url` = ?, `username` = ?, `password` = ?, `defaultAutoCommit` = ?, `defaultReadOnly` = ?, `defaultTransactionIsolation` = ?, `defaultCatalog` = ?, `maxActive` = ?, `maxIdle` = ?, `minIdle` = ?, `initialSize` = ?, `maxWait` = ?, `maxAge` = ?, `testOnBorrow` = ?, `testOnReturn` = ?, `testWhileIdle` = ?, `validationQuery` = ?, `validationQueryTimeout` = ?, `timeBetweenEvictionRunsMillis` = ?, `minEvictableIdleTimeMillis` = ?, `connectionProperties` = ?, `initSQL` = ?, `jdbcInterceptors` = ?, `validationInterval` = ?, `logValidationErrors` = ?, `datasource.svc.properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDatasourceDataSourceFactoryProperties`
--
DELETE FROM `orgApacheSlingDatasourceDataSourceFactoryProperties` WHERE 0;

