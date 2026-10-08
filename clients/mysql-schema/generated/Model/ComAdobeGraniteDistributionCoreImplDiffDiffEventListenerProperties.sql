--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperti`
--
SELECT `diffPath`, `serviceName`, `serviceUser.target` FROM `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperti` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperti`
--
INSERT INTO `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperti`(`diffPath`, `serviceName`, `serviceUser.target`) VALUES (?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperti`
--
UPDATE `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperti` SET `diffPath` = ?, `serviceName` = ?, `serviceUser.target` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperti`
--
DELETE FROM `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperti` WHERE 0;

