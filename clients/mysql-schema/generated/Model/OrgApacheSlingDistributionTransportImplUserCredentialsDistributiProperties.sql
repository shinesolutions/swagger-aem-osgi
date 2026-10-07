--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties' definition.
--


--
-- SELECT template for table `orgApacheSlingDistributionTransportImplUserCredentialsDistributi`
--
SELECT `name`, `username`, `password` FROM `orgApacheSlingDistributionTransportImplUserCredentialsDistributi` WHERE 1;

--
-- INSERT template for table `orgApacheSlingDistributionTransportImplUserCredentialsDistributi`
--
INSERT INTO `orgApacheSlingDistributionTransportImplUserCredentialsDistributi`(`name`, `username`, `password`) VALUES (?, ?, ?);

--
-- UPDATE template for table `orgApacheSlingDistributionTransportImplUserCredentialsDistributi`
--
UPDATE `orgApacheSlingDistributionTransportImplUserCredentialsDistributi` SET `name` = ?, `username` = ?, `password` = ? WHERE 1;

--
-- DELETE template for table `orgApacheSlingDistributionTransportImplUserCredentialsDistributi`
--
DELETE FROM `orgApacheSlingDistributionTransportImplUserCredentialsDistributi` WHERE 0;

