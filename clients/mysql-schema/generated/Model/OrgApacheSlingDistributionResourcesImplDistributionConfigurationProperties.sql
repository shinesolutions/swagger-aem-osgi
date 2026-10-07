--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionResourcesImplDistributionConfigurationProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionResourcesImplDistributionConfiguration`
--
SELECT `provider.roots`, `kind` FROM `orgApacheSlingDistributionResourcesImplDistributionConfiguration` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionResourcesImplDistributionConfiguration`
--
INSERT INTO `orgApacheSlingDistributionResourcesImplDistributionConfiguration`(`provider.roots`, `kind`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionResourcesImplDistributionConfiguration`
--
UPDATE `orgApacheSlingDistributionResourcesImplDistributionConfiguration` SET `provider.roots` = ?, `kind` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionResourcesImplDistributionConfiguration`
--
DELETE FROM `orgApacheSlingDistributionResourcesImplDistributionConfiguration` WHERE 0;

