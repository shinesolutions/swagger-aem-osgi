--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingI18nImplJcrResourceBundleProviderInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingI18nImplJcrResourceBundleProviderInfo`
--
SELECT `pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location` FROM `orgApacheSlingI18nImplJcrResourceBundleProviderInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingI18nImplJcrResourceBundleProviderInfo`
--
INSERT INTO `orgApacheSlingI18nImplJcrResourceBundleProviderInfo`(`pid`, `title`, `description`, `properties`, `additionalProperties`, `bundle_location`, `service_location`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingI18nImplJcrResourceBundleProviderInfo`
--
UPDATE `orgApacheSlingI18nImplJcrResourceBundleProviderInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ?, `additionalProperties` = ?, `bundle_location` = ?, `service_location` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingI18nImplJcrResourceBundleProviderInfo`
--
DELETE FROM `orgApacheSlingI18nImplJcrResourceBundleProviderInfo` WHERE 0;

