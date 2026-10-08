--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo`
--
INSERT INTO `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo`
--
UPDATE `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo`
--
DELETE FROM `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo` WHERE 0;

