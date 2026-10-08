--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingServletsGetDefaultGetServletInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingServletsGetDefaultGetServletInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingServletsGetDefaultGetServletInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingServletsGetDefaultGetServletInfo`
--
INSERT INTO `orgApacheSlingServletsGetDefaultGetServletInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingServletsGetDefaultGetServletInfo`
--
UPDATE `orgApacheSlingServletsGetDefaultGetServletInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingServletsGetDefaultGetServletInfo`
--
DELETE FROM `orgApacheSlingServletsGetDefaultGetServletInfo` WHERE 0;

