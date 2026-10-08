--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties`
--
SELECT `job.consumermanager.disableDistribution`, `startup.delay`, `cleanup.period` FROM `orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties`
--
INSERT INTO `orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties`(`job.consumermanager.disableDistribution`, `startup.delay`, `cleanup.period`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties`
--
UPDATE `orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties` SET `job.consumermanager.disableDistribution` = ?, `startup.delay` = ?, `cleanup.period` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties`
--
DELETE FROM `orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties` WHERE 0;

