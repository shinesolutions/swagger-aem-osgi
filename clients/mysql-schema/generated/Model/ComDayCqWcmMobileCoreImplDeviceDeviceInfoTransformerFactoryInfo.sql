--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo`
--
INSERT INTO `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo`
--
UPDATE `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo`
--
DELETE FROM `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo` WHERE 0;

