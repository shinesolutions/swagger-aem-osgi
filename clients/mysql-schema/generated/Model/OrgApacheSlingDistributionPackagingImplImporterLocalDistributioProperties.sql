--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionPackagingImplImporterLocalDistributioP`
--
SELECT `name`, `packageBuilder.target` FROM `orgApacheSlingDistributionPackagingImplImporterLocalDistributioP` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionPackagingImplImporterLocalDistributioP`
--
INSERT INTO `orgApacheSlingDistributionPackagingImplImporterLocalDistributioP`(`name`, `packageBuilder.target`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionPackagingImplImporterLocalDistributioP`
--
UPDATE `orgApacheSlingDistributionPackagingImplImporterLocalDistributioP` SET `name` = ?, `packageBuilder.target` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionPackagingImplImporterLocalDistributioP`
--
DELETE FROM `orgApacheSlingDistributionPackagingImplImporterLocalDistributioP` WHERE 0;

