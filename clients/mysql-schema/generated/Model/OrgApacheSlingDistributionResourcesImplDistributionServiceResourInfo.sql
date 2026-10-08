--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionResourcesImplDistributionServiceResourInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionResourcesImplDistributionServiceResour`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionResourcesImplDistributionServiceResour` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionResourcesImplDistributionServiceResour`
--
INSERT INTO `orgApacheSlingDistributionResourcesImplDistributionServiceResour`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionResourcesImplDistributionServiceResour`
--
UPDATE `orgApacheSlingDistributionResourcesImplDistributionServiceResour` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionResourcesImplDistributionServiceResour`
--
DELETE FROM `orgApacheSlingDistributionResourcesImplDistributionServiceResour` WHERE 0;

