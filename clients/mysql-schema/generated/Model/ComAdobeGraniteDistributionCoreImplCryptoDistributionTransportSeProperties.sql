--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe`
--
SELECT `name`, `username`, `encryptedPassword` FROM `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe`
--
INSERT INTO `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe`(`name`, `username`, `encryptedPassword`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe`
--
UPDATE `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe` SET `name` = ?, `username` = ?, `encryptedPassword` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe`
--
DELETE FROM `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe` WHERE 0;

