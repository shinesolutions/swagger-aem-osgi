--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEventImplJobsDefaultJobManagerInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingEventImplJobsDefaultJobManagerInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingEventImplJobsDefaultJobManagerInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEventImplJobsDefaultJobManagerInfo`
--
INSERT INTO `orgApacheSlingEventImplJobsDefaultJobManagerInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEventImplJobsDefaultJobManagerInfo`
--
UPDATE `orgApacheSlingEventImplJobsDefaultJobManagerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEventImplJobsDefaultJobManagerInfo`
--
DELETE FROM `orgApacheSlingEventImplJobsDefaultJobManagerInfo` WHERE 0;

