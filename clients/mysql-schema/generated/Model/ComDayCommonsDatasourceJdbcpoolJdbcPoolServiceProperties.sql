--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties' definition.
--


--
-- SELECT template for table `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties`
--
SELECT `jdbc.driver.class`, `jdbc.connection.uri`, `jdbc.username`, `jdbc.password`, `jdbc.validation.query`, `default.readonly`, `default.autocommit`, `pool.size`, `pool.max.wait.msec`, `datasource.name`, `datasource.svc.properties` FROM `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties` WHERE 1;

--
-- INSERT template for table `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties`
--
INSERT INTO `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties`(`jdbc.driver.class`, `jdbc.connection.uri`, `jdbc.username`, `jdbc.password`, `jdbc.validation.query`, `default.readonly`, `default.autocommit`, `pool.size`, `pool.max.wait.msec`, `datasource.name`, `datasource.svc.properties`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties`
--
UPDATE `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties` SET `jdbc.driver.class` = ?, `jdbc.connection.uri` = ?, `jdbc.username` = ?, `jdbc.password` = ?, `jdbc.validation.query` = ?, `default.readonly` = ?, `default.autocommit` = ?, `pool.size` = ?, `pool.max.wait.msec` = ?, `datasource.name` = ?, `datasource.svc.properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties`
--
DELETE FROM `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties` WHERE 0;

