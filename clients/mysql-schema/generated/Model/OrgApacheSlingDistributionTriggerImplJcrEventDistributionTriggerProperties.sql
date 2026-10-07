--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger`
--
SELECT `name`, `path`, `ignoredPathsPatterns`, `serviceName`, `deep` FROM `orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger`
--
INSERT INTO `orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger`(`name`, `path`, `ignoredPathsPatterns`, `serviceName`, `deep`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger`
--
UPDATE `orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger` SET `name` = ?, `path` = ?, `ignoredPathsPatterns` = ?, `serviceName` = ?, `deep` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger`
--
DELETE FROM `orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger` WHERE 0;

