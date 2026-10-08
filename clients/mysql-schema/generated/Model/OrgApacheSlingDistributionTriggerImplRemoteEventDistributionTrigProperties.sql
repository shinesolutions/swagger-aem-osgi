--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig`
--
SELECT `name`, `endpoint`, `transportSecretProvider.target` FROM `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig`
--
INSERT INTO `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig`(`name`, `endpoint`, `transportSecretProvider.target`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig`
--
UPDATE `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig` SET `name` = ?, `endpoint` = ?, `transportSecretProvider.target` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig`
--
DELETE FROM `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig` WHERE 0;

