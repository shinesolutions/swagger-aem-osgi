--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplWCMDebugFilterInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplWCMDebugFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmCoreImplWCMDebugFilterInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplWCMDebugFilterInfo`
--
INSERT INTO `comDayCqWcmCoreImplWCMDebugFilterInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplWCMDebugFilterInfo`
--
UPDATE `comDayCqWcmCoreImplWCMDebugFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplWCMDebugFilterInfo`
--
DELETE FROM `comDayCqWcmCoreImplWCMDebugFilterInfo` WHERE 0;

