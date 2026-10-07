--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi`
--
INSERT INTO `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi`
--
UPDATE `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi`
--
DELETE FROM `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi` WHERE 0;

