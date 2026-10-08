--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo`
--
INSERT INTO `orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo`
--
UPDATE `orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo`
--
DELETE FROM `orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo` WHERE 0;

