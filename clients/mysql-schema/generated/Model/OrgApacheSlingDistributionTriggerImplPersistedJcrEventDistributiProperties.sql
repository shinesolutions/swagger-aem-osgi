--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi`
--
SELECT `name`, `path`, `serviceName`, `nuggetsPath` FROM `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi`
--
INSERT INTO `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi`(`name`, `path`, `serviceName`, `nuggetsPath`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi`
--
UPDATE `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi` SET `name` = ?, `path` = ?, `serviceName` = ?, `nuggetsPath` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi`
--
DELETE FROM `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi` WHERE 0;

