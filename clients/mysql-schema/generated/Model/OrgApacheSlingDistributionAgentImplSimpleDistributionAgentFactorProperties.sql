--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor`
--
SELECT `name`, `title`, `details`, `enabled`, `serviceName`, `log.level`, `queue.processing.enabled`, `packageExporter.target`, `packageImporter.target`, `requestAuthorizationStrategy.target`, `triggers.target` FROM `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor`
--
INSERT INTO `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor`(`name`, `title`, `details`, `enabled`, `serviceName`, `log.level`, `queue.processing.enabled`, `packageExporter.target`, `packageImporter.target`, `requestAuthorizationStrategy.target`, `triggers.target`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor`
--
UPDATE `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor` SET `name` = ?, `title` = ?, `details` = ?, `enabled` = ?, `serviceName` = ?, `log.level` = ?, `queue.processing.enabled` = ?, `packageExporter.target` = ?, `packageImporter.target` = ?, `requestAuthorizationStrategy.target` = ?, `triggers.target` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor`
--
DELETE FROM `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor` WHERE 0;

