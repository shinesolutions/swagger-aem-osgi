--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionTriggerImplResourceEventDistributionTr`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionTriggerImplResourceEventDistributionTr` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionTriggerImplResourceEventDistributionTr`
--
INSERT INTO `orgApacheSlingDistributionTriggerImplResourceEventDistributionTr`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionTriggerImplResourceEventDistributionTr`
--
UPDATE `orgApacheSlingDistributionTriggerImplResourceEventDistributionTr` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionTriggerImplResourceEventDistributionTr`
--
DELETE FROM `orgApacheSlingDistributionTriggerImplResourceEventDistributionTr` WHERE 0;

