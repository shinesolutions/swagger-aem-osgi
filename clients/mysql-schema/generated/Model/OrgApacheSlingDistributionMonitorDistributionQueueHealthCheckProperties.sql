--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPro`
--
SELECT `hc.name`, `hc.tags`, `hc.mbean.name`, `numberOfRetriesAllowed` FROM `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPro` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPro`
--
INSERT INTO `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPro`(`hc.name`, `hc.tags`, `hc.mbean.name`, `numberOfRetriesAllowed`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPro`
--
UPDATE `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPro` SET `hc.name` = ?, `hc.tags` = ?, `hc.mbean.name` = ?, `numberOfRetriesAllowed` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPro`
--
DELETE FROM `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPro` WHERE 0;

