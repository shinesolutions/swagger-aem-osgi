--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingFeatureflagsImplConfiguredFeatureProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingFeatureflagsImplConfiguredFeatureProperties`
--
SELECT `name`, `description`, `enabled` FROM `orgApacheSlingFeatureflagsImplConfiguredFeatureProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingFeatureflagsImplConfiguredFeatureProperties`
--
INSERT INTO `orgApacheSlingFeatureflagsImplConfiguredFeatureProperties`(`name`, `description`, `enabled`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingFeatureflagsImplConfiguredFeatureProperties`
--
UPDATE `orgApacheSlingFeatureflagsImplConfiguredFeatureProperties` SET `name` = ?, `description` = ?, `enabled` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingFeatureflagsImplConfiguredFeatureProperties`
--
DELETE FROM `orgApacheSlingFeatureflagsImplConfiguredFeatureProperties` WHERE 0;

