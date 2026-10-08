--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiP`
--
SELECT `name`, `endpoints`, `pull.items`, `packageBuilder.target`, `transportSecretProvider.target` FROM `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiP` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiP`
--
INSERT INTO `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiP`(`name`, `endpoints`, `pull.items`, `packageBuilder.target`, `transportSecretProvider.target`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiP`
--
UPDATE `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiP` SET `name` = ?, `endpoints` = ?, `pull.items` = ?, `packageBuilder.target` = ?, `transportSecretProvider.target` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiP`
--
DELETE FROM `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiP` WHERE 0;

