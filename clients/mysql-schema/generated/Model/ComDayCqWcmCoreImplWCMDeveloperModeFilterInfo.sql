--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplWCMDeveloperModeFilterInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplWCMDeveloperModeFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `comDayCqWcmCoreImplWCMDeveloperModeFilterInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplWCMDeveloperModeFilterInfo`
--
INSERT INTO `comDayCqWcmCoreImplWCMDeveloperModeFilterInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplWCMDeveloperModeFilterInfo`
--
UPDATE `comDayCqWcmCoreImplWCMDeveloperModeFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplWCMDeveloperModeFilterInfo`
--
DELETE FROM `comDayCqWcmCoreImplWCMDeveloperModeFilterInfo` WHERE 0;

