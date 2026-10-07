--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryI` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryI`
--
INSERT INTO `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryI`
--
UPDATE `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryI`
--
DELETE FROM `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryI` WHERE 0;

