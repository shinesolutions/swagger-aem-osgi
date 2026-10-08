--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPr`
--
SELECT `dim.default.mode`, `dim.appcache.enabled` FROM `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPr` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPr`
--
INSERT INTO `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPr`(`dim.default.mode`, `dim.appcache.enabled`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPr`
--
UPDATE `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPr` SET `dim.default.mode` = ?, `dim.appcache.enabled` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPr`
--
DELETE FROM `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPr` WHERE 0;

