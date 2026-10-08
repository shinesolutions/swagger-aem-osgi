--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingHcCoreImplCompositeHealthCheckInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingHcCoreImplCompositeHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingHcCoreImplCompositeHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingHcCoreImplCompositeHealthCheckInfo`
--
INSERT INTO `orgApacheSlingHcCoreImplCompositeHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingHcCoreImplCompositeHealthCheckInfo`
--
UPDATE `orgApacheSlingHcCoreImplCompositeHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingHcCoreImplCompositeHealthCheckInfo`
--
DELETE FROM `orgApacheSlingHcCoreImplCompositeHealthCheckInfo` WHERE 0;

