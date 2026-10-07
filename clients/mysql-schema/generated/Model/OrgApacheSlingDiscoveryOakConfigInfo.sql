--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDiscoveryOakConfigInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDiscoveryOakConfigInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingDiscoveryOakConfigInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDiscoveryOakConfigInfo`
--
INSERT INTO `orgApacheSlingDiscoveryOakConfigInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDiscoveryOakConfigInfo`
--
UPDATE `orgApacheSlingDiscoveryOakConfigInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDiscoveryOakConfigInfo`
--
DELETE FROM `orgApacheSlingDiscoveryOakConfigInfo` WHERE 0;

