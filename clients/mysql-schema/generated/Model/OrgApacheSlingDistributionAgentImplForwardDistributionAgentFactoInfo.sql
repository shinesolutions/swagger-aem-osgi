--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto`
--
INSERT INTO `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto`
--
UPDATE `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto`
--
DELETE FROM `orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto` WHERE 0;

