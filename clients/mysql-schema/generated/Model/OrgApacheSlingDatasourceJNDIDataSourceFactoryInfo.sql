--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDatasourceJNDIDataSourceFactoryInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDatasourceJNDIDataSourceFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDatasourceJNDIDataSourceFactoryInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDatasourceJNDIDataSourceFactoryInfo`
--
INSERT INTO `orgApacheSlingDatasourceJNDIDataSourceFactoryInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDatasourceJNDIDataSourceFactoryInfo`
--
UPDATE `orgApacheSlingDatasourceJNDIDataSourceFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDatasourceJNDIDataSourceFactoryInfo`
--
DELETE FROM `orgApacheSlingDatasourceJNDIDataSourceFactoryInfo` WHERE 0;

