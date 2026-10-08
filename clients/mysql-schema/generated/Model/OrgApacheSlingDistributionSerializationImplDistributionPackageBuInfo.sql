--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionSerializationImplDistributionPackageBuInfo' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionSerializationImplDistributionPackageBu`
--
SELECT `pid`, `title`, `description`, `properties` FROM `orgApacheSlingDistributionSerializationImplDistributionPackageBu` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionSerializationImplDistributionPackageBu`
--
INSERT INTO `orgApacheSlingDistributionSerializationImplDistributionPackageBu`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionSerializationImplDistributionPackageBu`
--
UPDATE `orgApacheSlingDistributionSerializationImplDistributionPackageBu` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionSerializationImplDistributionPackageBu`
--
DELETE FROM `orgApacheSlingDistributionSerializationImplDistributionPackageBu` WHERE 0;

