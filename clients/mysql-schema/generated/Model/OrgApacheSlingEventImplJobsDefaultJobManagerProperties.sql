--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEventImplJobsDefaultJobManagerProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingEventImplJobsDefaultJobManagerProperties`
--
SELECT `queue.priority`, `queue.retries`, `queue.retrydelay`, `queue.maxparallel` FROM `orgApacheSlingEventImplJobsDefaultJobManagerProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEventImplJobsDefaultJobManagerProperties`
--
INSERT INTO `orgApacheSlingEventImplJobsDefaultJobManagerProperties`(`queue.priority`, `queue.retries`, `queue.retrydelay`, `queue.maxparallel`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEventImplJobsDefaultJobManagerProperties`
--
UPDATE `orgApacheSlingEventImplJobsDefaultJobManagerProperties` SET `queue.priority` = ?, `queue.retries` = ?, `queue.retrydelay` = ?, `queue.maxparallel` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEventImplJobsDefaultJobManagerProperties`
--
DELETE FROM `orgApacheSlingEventImplJobsDefaultJobManagerProperties` WHERE 0;

