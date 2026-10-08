--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingServletsResolverSlingServletResolverInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingServletsResolverSlingServletResolverInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingServletsResolverSlingServletResolverInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingServletsResolverSlingServletResolverInfo`
--
INSERT INTO `orgApacheSlingServletsResolverSlingServletResolverInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingServletsResolverSlingServletResolverInfo`
--
UPDATE `orgApacheSlingServletsResolverSlingServletResolverInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingServletsResolverSlingServletResolverInfo`
--
DELETE FROM `orgApacheSlingServletsResolverSlingServletResolverInfo` WHERE 0;

