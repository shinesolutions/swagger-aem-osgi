--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingModelsImplModelAdapterFactoryInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingModelsImplModelAdapterFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingModelsImplModelAdapterFactoryInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingModelsImplModelAdapterFactoryInfo`
--
INSERT INTO `orgApacheSlingModelsImplModelAdapterFactoryInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingModelsImplModelAdapterFactoryInfo`
--
UPDATE `orgApacheSlingModelsImplModelAdapterFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingModelsImplModelAdapterFactoryInfo`
--
DELETE FROM `orgApacheSlingModelsImplModelAdapterFactoryInfo` WHERE 0;

