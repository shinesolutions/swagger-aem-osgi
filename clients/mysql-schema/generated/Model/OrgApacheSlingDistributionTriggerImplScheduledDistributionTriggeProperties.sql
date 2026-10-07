--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge`
--
SELECT `name`, `path`, `seconds`, `serviceName` FROM `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge`
--
INSERT INTO `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge`(`name`, `path`, `seconds`, `serviceName`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge`
--
UPDATE `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge` SET `name` = ?, `path` = ?, `seconds` = ?, `serviceName` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge`
--
DELETE FROM `orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge` WHERE 0;

