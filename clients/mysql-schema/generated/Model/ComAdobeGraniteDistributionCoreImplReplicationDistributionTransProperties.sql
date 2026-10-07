--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties' definition.
--


--
-- SELECT template for table `comAdobeGraniteDistributionCoreImplReplicationDistributionTransP`
--
SELECT `forward.requests` FROM `comAdobeGraniteDistributionCoreImplReplicationDistributionTransP` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteDistributionCoreImplReplicationDistributionTransP`
--
INSERT INTO `comAdobeGraniteDistributionCoreImplReplicationDistributionTransP`(`forward.requests`) VALUES (?);

--
-- UPDATE template for table `comAdobeGraniteDistributionCoreImplReplicationDistributionTransP`
--
UPDATE `comAdobeGraniteDistributionCoreImplReplicationDistributionTransP` SET `forward.requests` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteDistributionCoreImplReplicationDistributionTransP`
--
DELETE FROM `comAdobeGraniteDistributionCoreImplReplicationDistributionTransP` WHERE 0;

