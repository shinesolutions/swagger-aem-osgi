--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties`
--
SELECT `max.quartzJob.duration.acceptable` FROM `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties`
--
INSERT INTO `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties`(`max.quartzJob.duration.acceptable`) VALUES (?);

--
-- UPDATE template for table `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties`
--
UPDATE `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties` SET `max.quartzJob.duration.acceptable` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties`
--
DELETE FROM `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties` WHERE 0;

