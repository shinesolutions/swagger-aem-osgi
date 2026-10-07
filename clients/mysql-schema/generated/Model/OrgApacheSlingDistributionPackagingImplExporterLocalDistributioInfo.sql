--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionPackagingImplExporterLocalDistributioI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionPackagingImplExporterLocalDistributioI` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionPackagingImplExporterLocalDistributioI`
--
INSERT INTO `orgApacheSlingDistributionPackagingImplExporterLocalDistributioI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionPackagingImplExporterLocalDistributioI`
--
UPDATE `orgApacheSlingDistributionPackagingImplExporterLocalDistributioI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionPackagingImplExporterLocalDistributioI`
--
DELETE FROM `orgApacheSlingDistributionPackagingImplExporterLocalDistributioI` WHERE 0;

