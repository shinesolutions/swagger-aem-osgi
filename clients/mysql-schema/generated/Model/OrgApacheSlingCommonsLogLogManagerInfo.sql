--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsLogLogManagerInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsLogLogManagerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingCommonsLogLogManagerInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsLogLogManagerInfo`
--
INSERT INTO `orgApacheSlingCommonsLogLogManagerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsLogLogManagerInfo`
--
UPDATE `orgApacheSlingCommonsLogLogManagerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsLogLogManagerInfo`
--
DELETE FROM `orgApacheSlingCommonsLogLogManagerInfo` WHERE 0;

