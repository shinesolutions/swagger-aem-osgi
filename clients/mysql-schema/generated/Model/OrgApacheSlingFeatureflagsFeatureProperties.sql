--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingFeatureflagsFeatureProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingFeatureflagsFeatureProperties`
--
SELECT `name`, `description`, `enabled` FROM `orgApacheSlingFeatureflagsFeatureProperties` WHERE 1;

--
-- INSERT template for table `orgApacheSlingFeatureflagsFeatureProperties`
--
INSERT INTO `orgApacheSlingFeatureflagsFeatureProperties`(`name`, `description`, `enabled`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingFeatureflagsFeatureProperties`
--
UPDATE `orgApacheSlingFeatureflagsFeatureProperties` SET `name` = ?, `description` = ?, `enabled` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingFeatureflagsFeatureProperties`
--
DELETE FROM `orgApacheSlingFeatureflagsFeatureProperties` WHERE 0;

