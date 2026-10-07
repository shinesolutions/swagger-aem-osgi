--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryP`
--
SELECT `name`, `title`, `details`, `enabled`, `serviceName`, `log.level`, `queue.processing.enabled`, `passiveQueues`, `packageExporter.endpoints`, `packageImporter.endpoints`, `retry.strategy`, `retry.attempts`, `pull.items`, `http.conn.timeout`, `requestAuthorizationStrategy.target`, `transportSecretProvider.target`, `packageBuilder.target`, `triggers.target` FROM `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryP` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryP`
--
INSERT INTO `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryP`(`name`, `title`, `details`, `enabled`, `serviceName`, `log.level`, `queue.processing.enabled`, `passiveQueues`, `packageExporter.endpoints`, `packageImporter.endpoints`, `retry.strategy`, `retry.attempts`, `pull.items`, `http.conn.timeout`, `requestAuthorizationStrategy.target`, `transportSecretProvider.target`, `packageBuilder.target`, `triggers.target`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryP`
--
UPDATE `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryP` SET `name` = ?, `title` = ?, `details` = ?, `enabled` = ?, `serviceName` = ?, `log.level` = ?, `queue.processing.enabled` = ?, `passiveQueues` = ?, `packageExporter.endpoints` = ?, `packageImporter.endpoints` = ?, `retry.strategy` = ?, `retry.attempts` = ?, `pull.items` = ?, `http.conn.timeout` = ?, `requestAuthorizationStrategy.target` = ?, `transportSecretProvider.target` = ?, `packageBuilder.target` = ?, `triggers.target` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryP`
--
DELETE FROM `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryP` WHERE 0;

