--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEventImplEventingThreadPoolInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingEventImplEventingThreadPoolInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingEventImplEventingThreadPoolInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEventImplEventingThreadPoolInfo`
--
INSERT INTO `orgApacheSlingEventImplEventingThreadPoolInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEventImplEventingThreadPoolInfo`
--
UPDATE `orgApacheSlingEventImplEventingThreadPoolInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEventImplEventingThreadPoolInfo`
--
DELETE FROM `orgApacheSlingEventImplEventingThreadPoolInfo` WHERE 0;

