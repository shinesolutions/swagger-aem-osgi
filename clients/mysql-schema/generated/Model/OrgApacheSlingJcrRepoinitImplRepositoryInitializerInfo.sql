--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo`
--
INSERT INTO `orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo`
--
UPDATE `orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo`
--
DELETE FROM `orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo` WHERE 0;

