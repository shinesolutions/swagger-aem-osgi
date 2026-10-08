--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInf`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInf` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInf`
--
INSERT INTO `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInf`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInf`
--
UPDATE `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInf` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInf`
--
DELETE FROM `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInf` WHERE 0;

