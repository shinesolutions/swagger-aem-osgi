--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionSerializationImplVltVaultDistributionP`
--
SELECT `name`, `type`, `importMode`, `aclHandling`, `package.roots`, `package.filters`, `property.filters`, `tempFsFolder`, `useBinaryReferences`, `autoSaveThreshold`, `cleanupDelay`, `fileThreshold`, `MEGA_BYTES`, `useOffHeapMemory`, `digestAlgorithm`, `monitoringQueueSize`, `pathsMapping`, `strictImport` FROM `orgApacheSlingDistributionSerializationImplVltVaultDistributionP` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionSerializationImplVltVaultDistributionP`
--
INSERT INTO `orgApacheSlingDistributionSerializationImplVltVaultDistributionP`(`name`, `type`, `importMode`, `aclHandling`, `package.roots`, `package.filters`, `property.filters`, `tempFsFolder`, `useBinaryReferences`, `autoSaveThreshold`, `cleanupDelay`, `fileThreshold`, `MEGA_BYTES`, `useOffHeapMemory`, `digestAlgorithm`, `monitoringQueueSize`, `pathsMapping`, `strictImport`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionSerializationImplVltVaultDistributionP`
--
UPDATE `orgApacheSlingDistributionSerializationImplVltVaultDistributionP` SET `name` = ?, `type` = ?, `importMode` = ?, `aclHandling` = ?, `package.roots` = ?, `package.filters` = ?, `property.filters` = ?, `tempFsFolder` = ?, `useBinaryReferences` = ?, `autoSaveThreshold` = ?, `cleanupDelay` = ?, `fileThreshold` = ?, `MEGA_BYTES` = ?, `useOffHeapMemory` = ?, `digestAlgorithm` = ?, `monitoringQueueSize` = ?, `pathsMapping` = ?, `strictImport` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionSerializationImplVltVaultDistributionP`
--
DELETE FROM `orgApacheSlingDistributionSerializationImplVltVaultDistributionP` WHERE 0;

