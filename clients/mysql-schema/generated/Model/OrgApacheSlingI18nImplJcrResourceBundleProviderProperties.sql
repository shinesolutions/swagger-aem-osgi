--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingI18nImplJcrResourceBundleProviderProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingI18nImplJcrResourceBundleProviderProperties`
--
SELECT `locale.default`, `preload.bundles`, `invalidation.delay` FROM `orgApacheSlingI18nImplJcrResourceBundleProviderProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingI18nImplJcrResourceBundleProviderProperties`
--
INSERT INTO `orgApacheSlingI18nImplJcrResourceBundleProviderProperties`(`locale.default`, `preload.bundles`, `invalidation.delay`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingI18nImplJcrResourceBundleProviderProperties`
--
UPDATE `orgApacheSlingI18nImplJcrResourceBundleProviderProperties` SET `locale.default` = ?, `preload.bundles` = ?, `invalidation.delay` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingI18nImplJcrResourceBundleProviderProperties`
--
DELETE FROM `orgApacheSlingI18nImplJcrResourceBundleProviderProperties` WHERE 0;

