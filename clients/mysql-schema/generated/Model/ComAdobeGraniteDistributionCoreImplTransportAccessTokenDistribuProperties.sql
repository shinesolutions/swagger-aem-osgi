--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuP`
--
SELECT `name`, `serviceName`, `userId`, `accessTokenProvider.target` FROM `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuP` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuP`
--
INSERT INTO `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuP`(`name`, `serviceName`, `userId`, `accessTokenProvider.target`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuP`
--
UPDATE `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuP` SET `name` = ?, `serviceName` = ?, `userId` = ?, `accessTokenProvider.target` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuP`
--
DELETE FROM `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuP` WHERE 0;

