--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDatasourceDataSourceFactoryInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDatasourceDataSourceFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDatasourceDataSourceFactoryInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDatasourceDataSourceFactoryInfo`
--
INSERT INTO `orgApacheSlingDatasourceDataSourceFactoryInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDatasourceDataSourceFactoryInfo`
--
UPDATE `orgApacheSlingDatasourceDataSourceFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDatasourceDataSourceFactoryInfo`
--
DELETE FROM `orgApacheSlingDatasourceDataSourceFactoryInfo` WHERE 0;

