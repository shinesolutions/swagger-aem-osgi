--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties' definition.
--


--
-- SELECT template for table `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPrope`
--
SELECT `device.info.transformer.enabled`, `device.info.transformer.css.style` FROM `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPrope` WHERE 1;

--
-- INSERT template for table `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPrope`
--
INSERT INTO `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPrope`(`device.info.transformer.enabled`, `device.info.transformer.css.style`) VALUES (?, ?);

--
-- UPDATE template for table `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPrope`
--
UPDATE `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPrope` SET `device.info.transformer.enabled` = ?, `device.info.transformer.css.style` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPrope`
--
DELETE FROM `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPrope` WHERE 0;

