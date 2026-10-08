--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionSerializationImplDistributionPackageBu`
--
SELECT `name`, `type`, `format.target`, `tempFsFolder`, `fileThreshold`, `memoryUnit`, `useOffHeapMemory`, `digestAlgorithm`, `monitoringQueueSize`, `cleanupDelay`, `package.filters`, `property.filters` FROM `orgApacheSlingDistributionSerializationImplDistributionPackageBu` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionSerializationImplDistributionPackageBu`
--
INSERT INTO `orgApacheSlingDistributionSerializationImplDistributionPackageBu`(`name`, `type`, `format.target`, `tempFsFolder`, `fileThreshold`, `memoryUnit`, `useOffHeapMemory`, `digestAlgorithm`, `monitoringQueueSize`, `cleanupDelay`, `package.filters`, `property.filters`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionSerializationImplDistributionPackageBu`
--
UPDATE `orgApacheSlingDistributionSerializationImplDistributionPackageBu` SET `name` = ?, `type` = ?, `format.target` = ?, `tempFsFolder` = ?, `fileThreshold` = ?, `memoryUnit` = ?, `useOffHeapMemory` = ?, `digestAlgorithm` = ?, `monitoringQueueSize` = ?, `cleanupDelay` = ?, `package.filters` = ?, `property.filters` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionSerializationImplDistributionPackageBu`
--
DELETE FROM `orgApacheSlingDistributionSerializationImplDistributionPackageBu` WHERE 0;

