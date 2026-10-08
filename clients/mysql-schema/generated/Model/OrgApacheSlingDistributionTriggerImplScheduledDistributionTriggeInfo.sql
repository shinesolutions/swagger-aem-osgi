--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge`
--
INSERT INTO `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge`
--
UPDATE `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge`
--
DELETE FROM `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge` WHERE 0;

