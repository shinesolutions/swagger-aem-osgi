--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo`
--
INSERT INTO `comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo`
--
UPDATE `comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo`
--
DELETE FROM `comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo` WHERE 0;

