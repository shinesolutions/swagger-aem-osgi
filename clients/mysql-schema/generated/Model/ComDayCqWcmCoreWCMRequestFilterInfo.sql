--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreWCMRequestFilterInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreWCMRequestFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmCoreWCMRequestFilterInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreWCMRequestFilterInfo`
--
INSERT INTO `comDayCqWcmCoreWCMRequestFilterInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreWCMRequestFilterInfo`
--
UPDATE `comDayCqWcmCoreWCMRequestFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreWCMRequestFilterInfo`
--
DELETE FROM `comDayCqWcmCoreWCMRequestFilterInfo` WHERE 0;

