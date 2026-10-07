--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteDistributionCoreImplReplicationDistributionTransI`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteDistributionCoreImplReplicationDistributionTransI` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteDistributionCoreImplReplicationDistributionTransI`
--
INSERT INTO `comAdobeGraniteDistributionCoreImplReplicationDistributionTransI`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteDistributionCoreImplReplicationDistributionTransI`
--
UPDATE `comAdobeGraniteDistributionCoreImplReplicationDistributionTransI` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteDistributionCoreImplReplicationDistributionTransI`
--
DELETE FROM `comAdobeGraniteDistributionCoreImplReplicationDistributionTransI` WHERE 0;

