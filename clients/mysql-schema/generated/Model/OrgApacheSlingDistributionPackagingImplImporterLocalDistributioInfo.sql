--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionPackagingImplImporterLocalDistributioI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionPackagingImplImporterLocalDistributioI` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionPackagingImplImporterLocalDistributioI`
--
INSERT INTO `orgApacheSlingDistributionPackagingImplImporterLocalDistributioI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionPackagingImplImporterLocalDistributioI`
--
UPDATE `orgApacheSlingDistributionPackagingImplImporterLocalDistributioI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionPackagingImplImporterLocalDistributioI`
--
DELETE FROM `orgApacheSlingDistributionPackagingImplImporterLocalDistributioI` WHERE 0;

