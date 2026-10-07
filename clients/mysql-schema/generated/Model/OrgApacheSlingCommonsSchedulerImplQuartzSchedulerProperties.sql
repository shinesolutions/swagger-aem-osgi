--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties`
--
SELECT `poolName`, `allowedPoolNames`, `scheduler.useleaderforsingle`, `metrics.filters`, `slowThresholdMillis` FROM `orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties`
--
INSERT INTO `orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties`(`poolName`, `allowedPoolNames`, `scheduler.useleaderforsingle`, `metrics.filters`, `slowThresholdMillis`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties`
--
UPDATE `orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties` SET `poolName` = ?, `allowedPoolNames` = ?, `scheduler.useleaderforsingle` = ?, `metrics.filters` = ?, `slowThresholdMillis` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties`
--
DELETE FROM `orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties` WHERE 0;

