--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplWarpTimeWarpFilterInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplWarpTimeWarpFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmCoreImplWarpTimeWarpFilterInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplWarpTimeWarpFilterInfo`
--
INSERT INTO `comDayCqWcmCoreImplWarpTimeWarpFilterInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplWarpTimeWarpFilterInfo`
--
UPDATE `comDayCqWcmCoreImplWarpTimeWarpFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplWarpTimeWarpFilterInfo`
--
DELETE FROM `comDayCqWcmCoreImplWarpTimeWarpFilterInfo` WHERE 0;

