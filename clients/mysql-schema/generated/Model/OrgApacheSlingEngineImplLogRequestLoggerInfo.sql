--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingEngineImplLogRequestLoggerInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingEngineImplLogRequestLoggerInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `orgApacheSlingEngineImplLogRequestLoggerInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingEngineImplLogRequestLoggerInfo`
--
INSERT INTO `orgApacheSlingEngineImplLogRequestLoggerInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingEngineImplLogRequestLoggerInfo`
--
UPDATE `orgApacheSlingEngineImplLogRequestLoggerInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingEngineImplLogRequestLoggerInfo`
--
DELETE FROM `orgApacheSlingEngineImplLogRequestLoggerInfo` WHERE 0;

