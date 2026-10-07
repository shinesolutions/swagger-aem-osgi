--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo`
--
INSERT INTO `orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo`
--
UPDATE `orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo`
--
DELETE FROM `orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo` WHERE 0;

