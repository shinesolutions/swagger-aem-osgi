--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionPackagingImplExporterAgentDistributioI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionPackagingImplExporterAgentDistributioI` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionPackagingImplExporterAgentDistributioI`
--
INSERT INTO `orgApacheSlingDistributionPackagingImplExporterAgentDistributioI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionPackagingImplExporterAgentDistributioI`
--
UPDATE `orgApacheSlingDistributionPackagingImplExporterAgentDistributioI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionPackagingImplExporterAgentDistributioI`
--
DELETE FROM `orgApacheSlingDistributionPackagingImplExporterAgentDistributioI` WHERE 0;

