--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor`
--
INSERT INTO `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor`
--
UPDATE `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor`
--
DELETE FROM `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor` WHERE 0;

