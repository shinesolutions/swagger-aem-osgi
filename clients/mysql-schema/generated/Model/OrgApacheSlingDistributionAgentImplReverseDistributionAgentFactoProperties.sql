--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto`
--
SELECT `name`, `title`, `details`, `enabled`, `serviceName`, `log.level`, `queue.processing.enabled`, `packageExporter.endpoints`, `pull.items`, `http.conn.timeout`, `requestAuthorizationStrategy.target`, `transportSecretProvider.target`, `packageBuilder.target`, `triggers.target` FROM `orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto`
--
INSERT INTO `orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto`(`name`, `title`, `details`, `enabled`, `serviceName`, `log.level`, `queue.processing.enabled`, `packageExporter.endpoints`, `pull.items`, `http.conn.timeout`, `requestAuthorizationStrategy.target`, `transportSecretProvider.target`, `packageBuilder.target`, `triggers.target`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto`
--
UPDATE `orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto` SET `name` = ?, `title` = ?, `details` = ?, `enabled` = ?, `serviceName` = ?, `log.level` = ?, `queue.processing.enabled` = ?, `packageExporter.endpoints` = ?, `pull.items` = ?, `http.conn.timeout` = ?, `requestAuthorizationStrategy.target` = ?, `transportSecretProvider.target` = ?, `packageBuilder.target` = ?, `triggers.target` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto`
--
DELETE FROM `orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto` WHERE 0;

