--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionTriggerImplDistributionEventDistribute`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionTriggerImplDistributionEventDistribute` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionTriggerImplDistributionEventDistribute`
--
INSERT INTO `orgApacheSlingDistributionTriggerImplDistributionEventDistribute`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionTriggerImplDistributionEventDistribute`
--
UPDATE `orgApacheSlingDistributionTriggerImplDistributionEventDistribute` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionTriggerImplDistributionEventDistribute`
--
DELETE FROM `orgApacheSlingDistributionTriggerImplDistributionEventDistribute` WHERE 0;

