--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo`
--
INSERT INTO `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo`
--
UPDATE `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo`
--
DELETE FROM `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo` WHERE 0;

