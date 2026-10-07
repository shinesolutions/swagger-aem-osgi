--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEventImplJobsJobConsumerManagerInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingEventImplJobsJobConsumerManagerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingEventImplJobsJobConsumerManagerInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEventImplJobsJobConsumerManagerInfo`
--
INSERT INTO `orgApacheSlingEventImplJobsJobConsumerManagerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEventImplJobsJobConsumerManagerInfo`
--
UPDATE `orgApacheSlingEventImplJobsJobConsumerManagerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEventImplJobsJobConsumerManagerInfo`
--
DELETE FROM `orgApacheSlingEventImplJobsJobConsumerManagerInfo` WHERE 0;

