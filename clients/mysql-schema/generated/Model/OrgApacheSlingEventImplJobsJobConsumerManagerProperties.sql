--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEventImplJobsJobConsumerManagerProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingEventImplJobsJobConsumerManagerProperties`
--
SELECT `org.apache.sling.installer.configuration.persist`, `job.consumermanager.whitelist`, `job.consumermanager.blacklist` FROM `orgApacheSlingEventImplJobsJobConsumerManagerProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEventImplJobsJobConsumerManagerProperties`
--
INSERT INTO `orgApacheSlingEventImplJobsJobConsumerManagerProperties`(`org.apache.sling.installer.configuration.persist`, `job.consumermanager.whitelist`, `job.consumermanager.blacklist`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEventImplJobsJobConsumerManagerProperties`
--
UPDATE `orgApacheSlingEventImplJobsJobConsumerManagerProperties` SET `org.apache.sling.installer.configuration.persist` = ?, `job.consumermanager.whitelist` = ?, `job.consumermanager.blacklist` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEventImplJobsJobConsumerManagerProperties`
--
DELETE FROM `orgApacheSlingEventImplJobsJobConsumerManagerProperties` WHERE 0;

