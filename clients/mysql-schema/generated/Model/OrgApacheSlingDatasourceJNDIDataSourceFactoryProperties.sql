--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDatasourceJNDIDataSourceFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDatasourceJNDIDataSourceFactoryProperties`
--
SELECT `datasource.name`, `datasource.svc.prop.name`, `datasource.jndi.name`, `jndi.properties` FROM `orgApacheSlingDatasourceJNDIDataSourceFactoryProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDatasourceJNDIDataSourceFactoryProperties`
--
INSERT INTO `orgApacheSlingDatasourceJNDIDataSourceFactoryProperties`(`datasource.name`, `datasource.svc.prop.name`, `datasource.jndi.name`, `jndi.properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDatasourceJNDIDataSourceFactoryProperties`
--
UPDATE `orgApacheSlingDatasourceJNDIDataSourceFactoryProperties` SET `datasource.name` = ?, `datasource.svc.prop.name` = ?, `datasource.jndi.name` = ?, `jndi.properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDatasourceJNDIDataSourceFactoryProperties`
--
DELETE FROM `orgApacheSlingDatasourceJNDIDataSourceFactoryProperties` WHERE 0;

