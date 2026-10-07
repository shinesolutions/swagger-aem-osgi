--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionResourcesImplDistributionServiceResour`
--
SELECT `provider.roots`, `kind` FROM `orgApacheSlingDistributionResourcesImplDistributionServiceResour` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionResourcesImplDistributionServiceResour`
--
INSERT INTO `orgApacheSlingDistributionResourcesImplDistributionServiceResour`(`provider.roots`, `kind`) VALUES (?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionResourcesImplDistributionServiceResour`
--
UPDATE `orgApacheSlingDistributionResourcesImplDistributionServiceResour` SET `provider.roots` = ?, `kind` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionResourcesImplDistributionServiceResour`
--
DELETE FROM `orgApacheSlingDistributionResourcesImplDistributionServiceResour` WHERE 0;

