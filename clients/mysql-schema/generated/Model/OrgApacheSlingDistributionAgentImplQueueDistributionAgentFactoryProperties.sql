--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory`
--
SELECT `name`, `title`, `details`, `enabled`, `serviceName`, `log.level`, `allowed.roots`, `requestAuthorizationStrategy.target`, `queueProviderFactory.target`, `packageBuilder.target`, `triggers.target`, `priorityQueues` FROM `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory`
--
INSERT INTO `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory`(`name`, `title`, `details`, `enabled`, `serviceName`, `log.level`, `allowed.roots`, `requestAuthorizationStrategy.target`, `queueProviderFactory.target`, `packageBuilder.target`, `triggers.target`, `priorityQueues`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory`
--
UPDATE `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory` SET `name` = ?, `title` = ?, `details` = ?, `enabled` = ?, `serviceName` = ?, `log.level` = ?, `allowed.roots` = ?, `requestAuthorizationStrategy.target` = ?, `queueProviderFactory.target` = ?, `packageBuilder.target` = ?, `triggers.target` = ?, `priorityQueues` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory`
--
DELETE FROM `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory` WHERE 0;

