--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingFeatureflagsImplConfiguredFeatureInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingFeatureflagsImplConfiguredFeatureInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingFeatureflagsImplConfiguredFeatureInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingFeatureflagsImplConfiguredFeatureInfo`
--
INSERT INTO `orgApacheSlingFeatureflagsImplConfiguredFeatureInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingFeatureflagsImplConfiguredFeatureInfo`
--
UPDATE `orgApacheSlingFeatureflagsImplConfiguredFeatureInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingFeatureflagsImplConfiguredFeatureInfo`
--
DELETE FROM `orgApacheSlingFeatureflagsImplConfiguredFeatureInfo` WHERE 0;

