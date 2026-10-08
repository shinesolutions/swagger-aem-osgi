--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiP`
--
SELECT `name`, `endpoints`, `transportSecretProvider.target` FROM `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiP` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiP`
--
INSERT INTO `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiP`(`name`, `endpoints`, `transportSecretProvider.target`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiP`
--
UPDATE `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiP` SET `name` = ?, `endpoints` = ?, `transportSecretProvider.target` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiP`
--
DELETE FROM `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiP` WHERE 0;

