--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionPackagingImplExporterLocalDistributioP`
--
SELECT `name`, `packageBuilder.target` FROM `orgApacheSlingDistributionPackagingImplExporterLocalDistributioP` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionPackagingImplExporterLocalDistributioP`
--
INSERT INTO `orgApacheSlingDistributionPackagingImplExporterLocalDistributioP`(`name`, `packageBuilder.target`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionPackagingImplExporterLocalDistributioP`
--
UPDATE `orgApacheSlingDistributionPackagingImplExporterLocalDistributioP` SET `name` = ?, `packageBuilder.target` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionPackagingImplExporterLocalDistributioP`
--
DELETE FROM `orgApacheSlingDistributionPackagingImplExporterLocalDistributioP` WHERE 0;

