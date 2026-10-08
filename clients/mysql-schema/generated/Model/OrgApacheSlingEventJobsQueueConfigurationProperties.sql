--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEventJobsQueueConfigurationProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingEventJobsQueueConfigurationProperties`
--
SELECT `queue.name`, `queue.topics`, `queue.type`, `queue.priority`, `queue.retries`, `queue.retrydelay`, `queue.maxparallel`, `queue.keepJobs`, `queue.preferRunOnCreationInstance`, `queue.threadPoolSize`, `service.ranking` FROM `orgApacheSlingEventJobsQueueConfigurationProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEventJobsQueueConfigurationProperties`
--
INSERT INTO `orgApacheSlingEventJobsQueueConfigurationProperties`(`queue.name`, `queue.topics`, `queue.type`, `queue.priority`, `queue.retries`, `queue.retrydelay`, `queue.maxparallel`, `queue.keepJobs`, `queue.preferRunOnCreationInstance`, `queue.threadPoolSize`, `service.ranking`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEventJobsQueueConfigurationProperties`
--
UPDATE `orgApacheSlingEventJobsQueueConfigurationProperties` SET `queue.name` = ?, `queue.topics` = ?, `queue.type` = ?, `queue.priority` = ?, `queue.retries` = ?, `queue.retrydelay` = ?, `queue.maxparallel` = ?, `queue.keepJobs` = ?, `queue.preferRunOnCreationInstance` = ?, `queue.threadPoolSize` = ?, `service.ranking` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEventJobsQueueConfigurationProperties`
--
DELETE FROM `orgApacheSlingEventJobsQueueConfigurationProperties` WHERE 0;

