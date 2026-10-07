--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto`
--
SELECT `name`, `title`, `details`, `enabled`, `serviceName`, `log.level`, `allowed.roots`, `queue.processing.enabled`, `packageImporter.endpoints`, `passiveQueues`, `priorityQueues`, `retry.strategy`, `retry.attempts`, `requestAuthorizationStrategy.target`, `transportSecretProvider.target`, `packageBuilder.target`, `triggers.target`, `queue.provider`, `async.delivery`, `http.conn.timeout` FROM `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto`
--
INSERT INTO `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto`(`name`, `title`, `details`, `enabled`, `serviceName`, `log.level`, `allowed.roots`, `queue.processing.enabled`, `packageImporter.endpoints`, `passiveQueues`, `priorityQueues`, `retry.strategy`, `retry.attempts`, `requestAuthorizationStrategy.target`, `transportSecretProvider.target`, `packageBuilder.target`, `triggers.target`, `queue.provider`, `async.delivery`, `http.conn.timeout`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto`
--
UPDATE `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto` SET `name` = ?, `title` = ?, `details` = ?, `enabled` = ?, `serviceName` = ?, `log.level` = ?, `allowed.roots` = ?, `queue.processing.enabled` = ?, `packageImporter.endpoints` = ?, `passiveQueues` = ?, `priorityQueues` = ?, `retry.strategy` = ?, `retry.attempts` = ?, `requestAuthorizationStrategy.target` = ?, `transportSecretProvider.target` = ?, `packageBuilder.target` = ?, `triggers.target` = ?, `queue.provider` = ?, `async.delivery` = ?, `http.conn.timeout` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto`
--
DELETE FROM `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto` WHERE 0;

