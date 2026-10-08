--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comDayCqDamCoreImplServletGuidLookupFilterInfo' definition.
--


--
-- SELECT template for table `comDayCqDamCoreImplServletGuidLookupFilterInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `bundle_location`, `service_location` FROM `comDayCqDamCoreImplServletGuidLookupFilterInfo` WHERE 1;

--
-- INSERT template for table `comDayCqDamCoreImplServletGuidLookupFilterInfo`
--
INSERT INTO `comDayCqDamCoreImplServletGuidLookupFilterInfo`(`pid`, `title`, `description`, `properties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `comDayCqDamCoreImplServletGuidLookupFilterInfo`
--
UPDATE `comDayCqDamCoreImplServletGuidLookupFilterInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `comDayCqDamCoreImplServletGuidLookupFilterInfo`
--
DELETE FROM `comDayCqDamCoreImplServletGuidLookupFilterInfo` WHERE 0;

