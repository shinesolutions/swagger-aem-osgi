--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo' definition.
--


--
-- SELECT template for table `comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo` WHERE 1;

--
-- INSERT template for table `comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo`
--
INSERT INTO `comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo`
--
UPDATE `comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo`
--
DELETE FROM `comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo` WHERE 0;

