--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEventJobsQueueConfigurationInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingEventJobsQueueConfigurationInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingEventJobsQueueConfigurationInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEventJobsQueueConfigurationInfo`
--
INSERT INTO `orgApacheSlingEventJobsQueueConfigurationInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEventJobsQueueConfigurationInfo`
--
UPDATE `orgApacheSlingEventJobsQueueConfigurationInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEventJobsQueueConfigurationInfo`
--
DELETE FROM `orgApacheSlingEventJobsQueueConfigurationInfo` WHERE 0;

