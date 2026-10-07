--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory`
--
INSERT INTO `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory`
--
UPDATE `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory`
--
DELETE FROM `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory` WHERE 0;

