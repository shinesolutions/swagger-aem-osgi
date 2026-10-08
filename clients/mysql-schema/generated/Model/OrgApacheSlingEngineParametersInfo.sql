--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEngineParametersInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingEngineParametersInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingEngineParametersInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEngineParametersInfo`
--
INSERT INTO `orgApacheSlingEngineParametersInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEngineParametersInfo`
--
UPDATE `orgApacheSlingEngineParametersInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEngineParametersInfo`
--
DELETE FROM `orgApacheSlingEngineParametersInfo` WHERE 0;

