--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrRepoinitRepositoryInitializerInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrRepoinitRepositoryInitializerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingJcrRepoinitRepositoryInitializerInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrRepoinitRepositoryInitializerInfo`
--
INSERT INTO `orgApacheSlingJcrRepoinitRepositoryInitializerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrRepoinitRepositoryInitializerInfo`
--
UPDATE `orgApacheSlingJcrRepoinitRepositoryInitializerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrRepoinitRepositoryInitializerInfo`
--
DELETE FROM `orgApacheSlingJcrRepoinitRepositoryInitializerInfo` WHERE 0;

