--
-- Adobe Experience Manager OSGI config (AEM) API.
-- Prepared SQL queries for 'comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo' definition.
--


--
-- SELECT template for table `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatIn`
--
SELECT `pid`, `title`, `description`, `properties` FROM `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatIn` WHERE 1;

--
-- INSERT template for table `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatIn`
--
INSERT INTO `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatIn`(`pid`, `title`, `description`, `properties`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatIn`
--
UPDATE `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatIn` SET `pid` = ?, `title` = ?, `description` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatIn`
--
DELETE FROM `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatIn` WHERE 0;

