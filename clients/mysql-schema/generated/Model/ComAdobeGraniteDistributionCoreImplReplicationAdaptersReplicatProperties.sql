--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPr`
--
SELECT `providerName`, `forward.requests` FROM `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPr` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPr`
--
INSERT INTO `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPr`(`providerName`, `forward.requests`) VALUES (?, ?);

--
-- UPDATE template for table `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPr`
--
UPDATE `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPr` SET `providerName` = ?, `forward.requests` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPr`
--
DELETE FROM `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPr` WHERE 0;

