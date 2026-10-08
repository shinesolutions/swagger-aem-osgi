--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingFeatureflagsFeatureInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingFeatureflagsFeatureInfo`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingFeatureflagsFeatureInfo` WHERE 1;

--
-- INSERT template for table `orgApacheSlingFeatureflagsFeatureInfo`
--
INSERT INTO `orgApacheSlingFeatureflagsFeatureInfo`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingFeatureflagsFeatureInfo`
--
UPDATE `orgApacheSlingFeatureflagsFeatureInfo` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingFeatureflagsFeatureInfo`
--
DELETE FROM `orgApacheSlingFeatureflagsFeatureInfo` WHERE 0;

