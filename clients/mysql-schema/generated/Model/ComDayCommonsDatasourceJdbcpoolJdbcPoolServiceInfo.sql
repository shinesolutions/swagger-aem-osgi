--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo' definition.
--


--
-- SELECT template for table `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo` WHERE 1;

--
-- INSERT template for table `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo`
--
INSERT INTO `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo`
--
UPDATE `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo`
--
DELETE FROM `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo` WHERE 0;

