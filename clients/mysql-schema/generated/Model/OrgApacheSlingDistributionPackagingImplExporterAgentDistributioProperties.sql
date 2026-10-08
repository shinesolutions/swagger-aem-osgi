--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionPackagingImplExporterAgentDistributioP`
--
SELECT `name`, `queue`, `drop.invalid.items`, `agent.target` FROM `orgApacheSlingDistributionPackagingImplExporterAgentDistributioP` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionPackagingImplExporterAgentDistributioP`
--
INSERT INTO `orgApacheSlingDistributionPackagingImplExporterAgentDistributioP`(`name`, `queue`, `drop.invalid.items`, `agent.target`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionPackagingImplExporterAgentDistributioP`
--
UPDATE `orgApacheSlingDistributionPackagingImplExporterAgentDistributioP` SET `name` = ?, `queue` = ?, `drop.invalid.items` = ?, `agent.target` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionPackagingImplExporterAgentDistributioP`
--
DELETE FROM `orgApacheSlingDistributionPackagingImplExporterAgentDistributioP` WHERE 0;

