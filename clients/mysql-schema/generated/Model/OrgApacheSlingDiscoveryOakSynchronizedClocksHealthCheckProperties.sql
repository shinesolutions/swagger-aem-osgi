--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertie`
--
SELECT `hc.name`, `hc.tags`, `hc.mbean.name` FROM `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertie` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertie`
--
INSERT INTO `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertie`(`hc.name`, `hc.tags`, `hc.mbean.name`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertie`
--
UPDATE `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertie` SET `hc.name` = ?, `hc.tags` = ?, `hc.mbean.name` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertie`
--
DELETE FROM `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertie` WHERE 0;

