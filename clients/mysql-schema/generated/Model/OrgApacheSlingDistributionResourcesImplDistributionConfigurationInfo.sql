--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionResourcesImplDistributionConfigurationInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionResourcesImplDistributionConfiguration`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionResourcesImplDistributionConfiguration` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionResourcesImplDistributionConfiguration`
--
INSERT INTO `orgApacheSlingDistributionResourcesImplDistributionConfiguration`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionResourcesImplDistributionConfiguration`
--
UPDATE `orgApacheSlingDistributionResourcesImplDistributionConfiguration` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionResourcesImplDistributionConfiguration`
--
DELETE FROM `orgApacheSlingDistributionResourcesImplDistributionConfiguration` WHERE 0;

